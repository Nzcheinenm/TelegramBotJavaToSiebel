package org.example;


import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.json.JSONObject;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConectToSiebel {
    // Авторизуемся в системе
    public static boolean Login(String firstNameBot, String lastNameBot) throws IOException {
        int statusCode;
        String result;
        String rowId;
        String lastName;
        String firstName;
        String userName;

        final Request postResult = Request.Post("http://localhost:9001/siebel-rest/v1.0/service/Siebel%20Employee/QueryByExample?PageSize=2&ViewMode=All");

        postResult.bodyString("{\n" +
                "  \"body\":{\n" +
                "    \"StartRowNum\": \"0\",\n" +
                "      \"SiebelMessage\":{\n" +
                "        \"MessageId\":\"\",\n" +
                "        \"MessageType\":\"Integration Object\",\n" +
                "        \"IntObjectName\":\"Employee Interface\",\n" +
                "        \"IntObjectFormat\":\"Siebel Hierarchical\",\n" +
                "        \"ListOfEmployee Interface\":{\n" +
                "        \"Employee\":{\"Last Name\": \"" + lastNameBot + "\",\n" +
                "                             \"First Name\": \"" + firstNameBot + "\"}\n" +
                "        }\n" +
                "     }\n" +
                "   }\n" +
                "}", ContentType.APPLICATION_JSON).addHeader("Authorization", "Basic R1VFU1RFUk06U0lFQkVM");
        System.out.println(postResult.execute().returnContent().asString(StandardCharsets.UTF_8));
        HttpResponse response = postResult.execute().returnResponse();

        statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

        if (statusCode == 200) {
            result = postResult.execute().returnContent().asString(StandardCharsets.UTF_8);
            JSONObject myObject = new JSONObject(result);
            rowId = myObject.getJSONObject("items").getString("Id");
            lastName = myObject.getJSONObject("items").getString("Last Name");
            firstName = myObject.getJSONObject("items").getString("First Name");
            userName = myObject.getJSONObject("items").getString("Login Name");
            System.out.println(rowId + lastName + firstName + userName);
            return lastName.equals(lastNameBot) && firstName.equals(firstNameBot);

        } else {
            return false;
        }
    }


    // Запрашиваем информацию по Клиенту
    public static String infoAccount(String accountNameBot, String firstNameBot) throws IOException {
        int statusCode;
        String result;

        final Request postResult = Request.Post("http://localhost:9001/siebel-rest/v1.0/service/Siebel%20Account/QueryByExample?PageSize=2&ViewMode=All");

        postResult.bodyString("{\n" +
                "  \"body\":{\n" +
                "    \"StartRowNum\": \"0\",\n" +
                "      \"SiebelMessage\":{\n" +
                "        \"MessageId\":\"\",\n" +
                "        \"MessageType\":\"Integration Object\",\n" +
                "        \"IntObjectName\":\"Account Interface\",\n" +
                "        \"IntObjectFormat\":\"Siebel Hierarchical\",\n" +
                "        \"ListOfAccount Interface\":{\n" +
                "        \"Account\":{\"Name\": \"" + accountNameBot + "\" }\n" +
                "        }\n" +
                "     }\n" +
                "   }\n" +
                "}", ContentType.APPLICATION_JSON).addHeader("Authorization", "Basic U0FETUlOOlNJRUJFTA==");
        System.out.println(postResult.execute().returnContent().asString(StandardCharsets.UTF_8));
        HttpResponse response = postResult.execute().returnResponse();

        statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

        if (statusCode == 200) {
            result = postResult.execute().returnContent().asString(StandardCharsets.UTF_8);
            //JSONObject myObject = new JSONObject(result);
            result = ConectToSiebel.formatJson(result);
            return result;

        } else {
            return null;
        }
    }


    public static String formatJson(String jsonString) throws IOException {
        String outString;

        try {
            //преобразовываем все записанное JsonObject и парсим его в строки
            JsonReader reader = Json.createReader(new StringReader(jsonString));
            JsonObject jsonObject = reader.readObject();
            String[] arrJson = jsonObject.toString().split(",");
            String out = "";
            for (String s : arrJson) {
                out += s + "\n";
            }
            outString = out;

        } catch (IndexOutOfBoundsException e) {
            Bot.isNullResponse = true;
            outString = "Ошибка";
        }
        return outString;
    }


}

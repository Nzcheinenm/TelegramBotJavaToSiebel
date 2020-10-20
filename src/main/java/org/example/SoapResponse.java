/*
 * Класс для отправки\получения в Сибель
 * DKononov
 * Дескрипция из wsdl с помощью wsimport
 * Работа с Json с помощью Javax и Jackson
 */
package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.siebel.customui.*;
import com.siebel.xml.contact_20io.Contact;
import com.siebel.xml.contact_20io.ListOfContactIo;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class SoapResponse {

    // SAAJ - SOAP Client Testing
    public String requestAndResponse(String firstName, String middleName, String lastName) throws IOException {
        String outString;
        //Создаем экземпляер сервиса Сибель
        MTSSpcWebService_Service helloService = new MTSSpcWebService_Service();
        //Реализуем интерфейс взаимодействия
        MTSSpcWebService hello = helloService.getMTSSpcWebService();
        //Создаем запрос
        TelegramSiebelBotInput input = new TelegramSiebelBotInput();
        //Заполняем запрос нашими данными
        input.setFirstName(firstName);
        input.setLastName(lastName);
        input.setMiddleName(middleName);
        //Создаем экземпляр для ответа и сразу его заполняем
        TelegramSiebelBotOutput output = hello.telegramSiebelBot(input);
        //Парсим ответ
        ListOfContactIo listContact = output.getListOfContactIo();
        List<Contact> contact = listContact.getContact();

        StringWriter writer = new StringWriter();
        //это объект Jackson, который выполняет сериализацию
        ObjectMapper mapper = new ObjectMapper();
        //Удаление null элементов
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // сама сериализация: 1-куда, 2-что
        try {
            mapper.writeValue(writer, contact.get(0));
            //преобразовываем все записанное во StringWriter в JsonObject и парсим его в строки
            JsonReader reader  =  Json.createReader(new StringReader(writer.toString()));
            JsonObject jsonObject = reader.readObject();
            String[] arrJson = jsonObject.toString().split(",");
            String out = "";
            //arrJson[0] = "";
            //arrJson[arrJson.length-1]="";
            for (String s : arrJson) {
                out += s + "\n";
            }
            //System.out.println(out);
            //outString = writer.toString();
            outString=out;

        } catch (IndexOutOfBoundsException e) {
            Bot.isNullResponse = true;
            outString = "Ошибка";
        }
        return outString;
    }

}






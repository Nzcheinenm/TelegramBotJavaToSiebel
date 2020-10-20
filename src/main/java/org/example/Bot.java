package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.io.StringWriter;

public class Bot extends TelegramLongPollingBot {

    private String firstName;
    private String lastName;
    private String middleName = "";
    public static boolean isNullResponse;

    public void onUpdateReceived(Update update) {
        long chat_id;
        String msgGet;
        String[] msgArr;

        update.getUpdateId();
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        msgGet = update.getMessage().getText();

        chat_id = update.getMessage().getChatId();

        try {
           msgArr = msgGet.split(",");
        switch (msgArr[0]) {
            case "/start":
            case "/help":
                execute(sendMessage.setText("Для ввода данных введите:\n Фамилия,<Ваша Фамилия>" +
                        "\n Имя,<Ваше Имя>" +
                        "\n Отчество,<Ваше Отчество>" +
                        "\n Для отправки в Siebel - /send" +
                        "\n для справки- /lastname , /firstname, /middlename" +
                        "\n тестовые данные - Иван Иванов Иванович"));
                break;
            case "Hi":
            case "Привет":
            case "привет":
            case "хай":
                execute(sendMessage.setText("Приветос!"));
                break;
            case "/siebel":
                execute(sendMessage.setText("Siebel is not work"));
                break;
            case "/lastname":
                execute(sendMessage.setText("Введите - Фамилия,<Ваша Фамилия>"));
                break;
            case "Фамилия":
                lastName = msgArr[1];
                execute(sendMessage.setText("Введена Фамилия - " + lastName));
                break;
            case "/fistname":
                execute(sendMessage.setText("Введите - Имя,<Ваше Имя>"));
                break;
            case "Имя":
                firstName = msgArr[1];
                execute(sendMessage.setText("Введено Имя - " + firstName));
                break;
            case "/middlename":
                execute(sendMessage.setText("Введите - Отчество,<Ваше Отчество>"));
                break;
            case "Отчество":
                middleName = msgArr[1];
                execute(sendMessage.setText("Введено Отчество - " + middleName));
                break;
            case "/fio":
                execute(sendMessage.setText(lastName + " " + firstName + " " + middleName ));
                break;
            case "/send":
                if (firstName == null || lastName == null) {
                    if (firstName == null) {
                        execute(sendMessage.setText("Имя не введенo."));
                        break;
                    }
                    execute(sendMessage.setText("Фамилия не введенa."));
                    break;
                }
                //Ждем ответ, как получили, отправляем информацию
                execute(sendMessage.setText(sendSiebelMessage(firstName,middleName,lastName)));
                if (isNullResponse) {
                    execute(sendMessage.setText("Нет такого Контакта, либо данные введены не верно"));
                }
                break;
            default:
                execute(sendMessage.setText("Такой команды не имею("));
                break;
        }
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    public String sendSiebelMessage(String first,String middle, String last) throws IOException {
        SoapResponse soapResponse = new SoapResponse();
        return soapResponse.requestAndResponse(first,middle,last);
    }

    public String getBotUsername() {
        return "SiebelWebServiceTSCBot";
    }

    public String getBotToken() {
        return "";
    }
}
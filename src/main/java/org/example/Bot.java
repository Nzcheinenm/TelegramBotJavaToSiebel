/*
 * Класс обработки бота из телеграм
 * DKononov
 * API - telegrambots
 */
package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.io.IOException;

public class Bot extends TelegramLongPollingBot {

    private String firstName;
    private String lastName;
    private String middleName = "";
    public static boolean isNullResponse;

    public void onUpdateReceived(Update update) {
        long chat_id;
        String msgGet;
        String[] msgArr;

        //Обновляем Id интеграции с Телеграм
        update.getUpdateId();
        //Смотрим что именно в этом чате наше сообщение
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        //Принимаем инфо
        msgGet = update.getMessage().getText();

        chat_id = update.getMessage().getChatId();

        try {
            //Получаем ответы от пользователя, отсылаем в ответ свои
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
                    try {
                        lastName = msgArr[1];
                        execute(sendMessage.setText("Введена Фамилия - " + lastName));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        execute(sendMessage.setText("Не Введена Фамилия "));
                    }
                    break;
                case "/fistname":
                    execute(sendMessage.setText("Введите - Имя,<Ваше Имя>"));
                    break;
                case "Имя":
                    try {
                        firstName = msgArr[1];
                        execute(sendMessage.setText("Введено Имя - " + firstName));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        execute(sendMessage.setText("Не Введена Фамилия "));
                    }
                    break;
                case "/middlename":
                    execute(sendMessage.setText("Введите - Отчество,<Ваше Отчество>"));
                    break;
                case "Отчество":
                    try {
                        middleName = msgArr[1];
                        execute(sendMessage.setText("Введено Отчество - " + middleName));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        execute(sendMessage.setText("Не Введена Фамилия "));
                    }
                    break;
                case "/fio":
                    execute(sendMessage.setText(lastName + " " + firstName + " " + middleName));
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
                    execute(sendMessage.setText(sendSiebelMessage(firstName, middleName, lastName)));
                    if (isNullResponse) {
                        execute(sendMessage.setText("Нет такого Контакта, либо данные введены не верно"));
                    }
                    break;
                default:
                    execute(sendMessage.setText("Такой команды не имею( \n Для справки /help"));
                    break;
            }
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    //Класс для отправки и получения сообщения в Сибель
    public String sendSiebelMessage(String first, String middle, String last) throws IOException {
        SoapResponse soapResponse = new SoapResponse();
        return soapResponse.requestAndResponse(first, middle, last);
    }

    //Имя бота
    public String getBotUsername() {
        return "SiebelWebServiceTSCBot";
    }

    //Токкен бота
    public String getBotToken() {
        return "";
    }
}
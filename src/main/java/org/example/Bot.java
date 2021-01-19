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

    private String accountName;
    private String lastName;
    private String middleName = "";
    private String loginFirstName;
    private String loginLastName;
    public static boolean isNullResponse;
    private boolean logIn = false;

    public void onUpdateReceived(Update update) {
        long chat_id;
        String msgGet;

        String[] msgArr;

        //Обновляем Id интеграции с Телеграм
        update.getUpdateId();
        //Смотрим что именно в этом чате наше сообщение
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        //Принимаем сообщение пользователя
        msgGet = update.getMessage().getText();
        //Получаем Id Чата
        chat_id = update.getMessage().getChatId();

        try {
            //Получаем ответы от пользователя, отсылаем в ответ свои
            msgArr = msgGet.split(",");
            switch (msgArr[0]) {
                case "/start":
                case "/help":
                    execute(sendMessage.setText("Для ввода данных введите без пробела:\n Название,<Ваше Название>" +
                            "\n Для отправки в Siebel - /send" +
                            "\n для справки- /lastname , /firstname, /middlename" +
                            "\n тестовые данные - OZON"));
                    break;
                case "Hi":
                case "Привет":
                case "привет":
                case "хай":
                    System.out.println(update.getMessage());
                    execute(sendMessage.setText("Приветос!"));
                    System.out.println("Привет");
                    break;
                case "/name":
                    execute(sendMessage.setText("Введите - Название,<Ваше Название>"));
                    System.out.println("/name");
                    break;
                case "Название":
                    try {
                        accountName = msgArr[1];
                        execute(sendMessage.setText("Введено Название - " + accountName));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        execute(sendMessage.setText("Не Введено Название "));
                    }
                    System.out.println("Название");
                    break;
                case "/login":
                    loginFirstName = update.getMessage().getFrom().getFirstName();
                    loginLastName = update.getMessage().getFrom().getLastName();
                    System.out.println(loginFirstName + " " + loginLastName);
                    logIn = ConectToSiebel.Login(loginFirstName,loginLastName);
                    if(logIn) {
                        execute(sendMessage.setText("Вход в Siebel произведен "));
                        System.out.println(logIn);
                    } else {execute(sendMessage.setText("Вход в Siebel не произведен. Обратитесь к администратору Siebel"));}
                    System.out.println("Login to Siebel");
                    break;
                case "/send":
                    if(logIn) {
                        System.out.println("Send " + accountName);
                        if (accountName == null ) {
                            execute(sendMessage.setText("Название не введено."));
                            break;
                        }
                        //Ждем ответ, как получили, отправляем информацию
                        if (isNullResponse) {
                            execute(sendMessage.setText("Нет такого Контакта, либо данные введены не верно"));
                        } else {execute(sendMessage.setText(sendSiebelMessage(accountName)));}
                    } else {execute(sendMessage.setText("Вход в Siebel не произведен. Пожалуйста, авторизуйтесь"));}

                    break;
                default:
                    execute(sendMessage.setText("Такой команды не имею( \n Для справки /help"));
                    System.out.println("Default");
                    break;
            }
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    //Класс для отправки и получения сообщения в Сибель
    public String sendSiebelMessage(String first) throws IOException {
        String conect;
        conect = ConectToSiebel.infoAccount(accountName,accountName);
        System.out.println(conect);
        if(conect == null) {isNullResponse = true;
        return null;}
        else {return conect;}
    }

    //Имя бота
    public String getBotUsername() {
        return "SiebelWebServiceTSCBot";
    }

    //Токкен бота
    public String getBotToken() {
        return "1394774401:AAGKUeskHCov4ecTxWIcLG09fEPuz-u4cz0";
    }
}
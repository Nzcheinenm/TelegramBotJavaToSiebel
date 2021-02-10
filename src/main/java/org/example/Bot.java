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
    private final String middleName = "";
    public static boolean isNullResponse;
    private boolean logIn = false;

    public void onUpdateReceived(Update update) {
        long chat_id;
        String msgGet;
        String newEventString;
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
                            "\n Для отправки в Siebel запроса о клиенте - /send" +
                            "\n Для запроса количества задач - /count" +
                            "\n Для создания задач - /new" +
                            "\n для справки- /name " +
                            "\n тестовые данные - Название,OZON"));
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
                    String loginFirstName = update.getMessage().getFrom().getFirstName();
                    String loginLastName = update.getMessage().getFrom().getLastName();
                    System.out.println(loginFirstName + " " + loginLastName);
                    logIn = ConectToSiebel.Login(loginFirstName, loginLastName);
                    if (logIn) {
                        execute(sendMessage.setText("Вход в Siebel произведен "));
                        System.out.println(logIn);
                    } else {
                        execute(sendMessage.setText("Вход в Siebel не произведен. Обратитесь к администратору Siebel"));
                    }
                    System.out.println("Login to Siebel");
                    break;

                case "/send":
                    if (logIn) {
                        System.out.println("Send " + accountName);
                        if (accountName == null) {
                            execute(sendMessage.setText("Название не введено."));
                            break;
                        }
                        //Ждем ответ, как получили, отправляем информацию
                        newEventString = sendSiebelMessage(accountName, "infoAccount");
                        if (newEventString == null) {
                            execute(sendMessage.setText("Нет такого Клиента, либо данные введены не верно"));
                        } else {
                            execute(sendMessage.setText(newEventString));
                        }
                    } else {
                        execute(sendMessage.setText("Вход в Siebel не произведен. Пожалуйста, авторизуйтесь"));
                    }
                    break;

                case "/count":
                    if (logIn) {
                        //Ждем ответ, как получили, отправляем информацию
                        newEventString = sendSiebelMessage("", "countAction");
                        if (newEventString == null) {
                            execute(sendMessage.setText("Нет такого Пользователя, либо данные считаны не верно"));
                        } else {
                            execute(sendMessage.setText(newEventString));
                        }

                    } else {
                        execute(sendMessage.setText("Вход в Siebel не произведен. Пожалуйста, авторизуйтесь"));
                    }
                    break;

                case "/new":
                    if (logIn) {
                        //Ждем ответ, как получили, отправляем информацию
                        newEventString = sendSiebelMessage("", "NewAction");
                        if (newEventString == null) {
                            execute(sendMessage.setText("Нет такого Пользователя, либо данные считаны не верно"));
                        } else {
                            execute(sendMessage.setText(newEventString));
                        }

                    } else {
                        execute(sendMessage.setText("Вход в Siebel не произведен. Пожалуйста, авторизуйтесь"));
                    }
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
    public String sendSiebelMessage(String accountName, String method) throws IOException {
        String conect = null;
        if (method.equals("infoAccount")) {
            conect = ConectToSiebel.infoAccount(accountName, ConectToSiebel.userName);
        }
        if (method.equals("countAction")) {
            conect = ConectToSiebel.countAction(ConectToSiebel.userName);
        }
        if (method.equals("NewAction")) {
            conect = ConectToSiebel.newAction(ConectToSiebel.userName);
        }
        System.out.println(conect);
        return conect;
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
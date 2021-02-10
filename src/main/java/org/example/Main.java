package org.example;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws TelegramApiRequestException, IOException {
        //Соединяемся с API
        ApiContextInitializer.init();
        TelegramBotsApi telegram = new TelegramBotsApi();
        //Запускаем Бота
        telegram.registerBot(new Bot());


    }
}


package org.example;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws TelegramApiRequestException, IOException {
        ApiContextInitializer.init();
        TelegramBotsApi telegram = new TelegramBotsApi();
        telegram.registerBot(new Bot());

        SoapResponse soapResponse = new SoapResponse();
        System.out.println(soapResponse.requestAndResponse("A","","A"));
    }
}


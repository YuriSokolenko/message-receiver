package com.messenger.message_receiver.services;

import com.messenger.message_receiver.entity.Message;
import org.springframework.stereotype.Service;

@Service("3")
public class TelegramReportSender implements IMessageSender {

    private String status = "This is a Telegram report!";

    @Override
    public String sendReport() {
        System.out.println(status);
        return status;
    }
}

package com.messenger.message_receiver.services;

import com.messenger.message_receiver.entity.Message;
import org.springframework.stereotype.Service;

@Service("1")
public class WhatsappReportSender implements IMessageSender {

    private String status = "This is a whatsapp report!";

    @Override
    public String sendReport() {
        System.out.println(status);
        return status;
    }
}

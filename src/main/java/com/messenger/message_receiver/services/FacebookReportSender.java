package com.messenger.message_receiver.services;

import org.springframework.stereotype.Service;

@Service("2")
public class FacebookReportSender implements IMessageSender {

    private String status = "This is a facebook report!";

    @Override
    public String sendReport() {
        System.out.println(status);
        return status;
    }
}

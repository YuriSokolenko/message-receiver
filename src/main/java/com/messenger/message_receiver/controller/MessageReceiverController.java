package com.messenger.message_receiver.controller;

import com.messenger.message_receiver.entity.Message;
import com.messenger.message_receiver.services.IMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MessageReceiverController {

    @Autowired
    private Map<String, IMessageSender> map;

    @PostMapping("/message")
    public String receiveMessage(@RequestBody Message message){
        IMessageSender messageSender = map.get(message.getType());
        if(messageSender==null){
            throw new UnsupportedOperationException(message + " Unsupported type");
        }
        return messageSender.sendReport();
    }

}

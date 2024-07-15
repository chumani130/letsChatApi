package com.chumz.letsChatApi.service;

import com.chumz.letsChatApi.entity.Chat;
import com.chumz.letsChatApi.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    public Chat sendMessage(Chat chat) {
        chat.setId(UUID.randomUUID().toString());
        chat.setTimeStamp(new Date());
        chatRepository.saveChatMessage(chat);
        return chat;
    }
}

package com.chumz.letsChatApi.service;

import com.chumz.letsChatApi.entity.ChatMessage;
import com.chumz.letsChatApi.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    public ChatMessage sendMessage(ChatMessage chatMessage) {
        chatMessage.setId(UUID.randomUUID().toString());
        chatMessage.setTimeStamp(new Date());
        chatRepository.saveChatMessage(chatMessage);
        return chatMessage;
    }
}

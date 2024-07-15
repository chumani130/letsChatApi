package com.chumz.letsChatApi.controller;

import com.chumz.letsChatApi.entity.ChatMessage;
import com.chumz.letsChatApi.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chats")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/sendMessage")
    public ChatMessage sendMessage(@RequestBody ChatMessage chatMessage) {
        return chatService.sendMessage(chatMessage);
    }
}

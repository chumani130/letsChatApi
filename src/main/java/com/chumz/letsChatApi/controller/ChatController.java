package com.chumz.letsChatApi.controller;

import com.chumz.letsChatApi.entity.Chat;
import com.chumz.letsChatApi.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chats")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping
    public List<Chat> getAllChats() {
        return chatService.getAllChats();
    }

    @GetMapping("/{id}")
    public Chat getChatById(@PathVariable Long id) {
        return chatService.getChatById(id);
    }

    @PostMapping("/sendMessage")
    public Chat sendMessage(@RequestBody Chat chat) {
        return chatService.sendMessage(chat);
    }

    @PutMapping("/{id}")
    public Chat updateMessage(@PathVariable Long id, @RequestBody Chat updatedChat) {
        return chatService.updateMessage(id, updatedChat);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        chatService.deleteMessage(id);
    }
}

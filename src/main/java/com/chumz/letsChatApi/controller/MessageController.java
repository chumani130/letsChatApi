package com.chumz.letsChatApi.controller;

import com.chumz.letsChatApi.entity.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private List<Message> messages = new ArrayList<>();
    private Long nextId = 1L;

    // Get all messages
    @GetMapping
    public List<Message> getAllMessages() {
        return messages;
    }

    // Get message by ID
    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable Long id) {
        return messages.stream()
                .filter(message -> message.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Send a message
    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message) {
        message.setId(nextId++);
        messages.add(message);
        return message;
    }

    // Update a message by ID
    @PutMapping("/{id}")
    public Message updateMessage(@PathVariable Long id, @RequestBody Message updatedMessage) {
        Message message = getMessageById(id);
        if (message != null) {
            message.setContent(updatedMessage.getContent());
        }
        return message;
    }

    // Delete a message by ID
    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messages.removeIf(message -> message.getId().equals(id));
    }
}

package com.chumz.letsChatApi.service;


import com.google.firebase.messaging.Message;

import java.util.List;

public interface MessageService {

    // Retrieve all messages
    public List<Message> getAllMessages();

    // Retrieve a message by its ID
    public Message getMessageById(Long id);

    // Create a new message
    public Message sendMessage(Message message);

    // Update an existing message
    public Message updateMessage(Long id, Message updatedMessage);

    // Delete a message by its ID
    void deleteMessage(Long id);




}

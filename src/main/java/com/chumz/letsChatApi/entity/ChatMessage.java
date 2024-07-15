package com.chumz.letsChatApi.entity;
//import jakarta.persistence.Entity;

import lombok.*;

import java.util.Date;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private String id;
    private String senderId;
    private String receiverId;
    private String message;
    private Date timeStamp;


}

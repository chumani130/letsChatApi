package com.chumz.letsChatApi.entity;
//import jakarta.persistence.Entity;

import lombok.*;

import java.util.Date;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    private Long id;
    private String sender;
    private String message;
    private Date timeStamp;


}

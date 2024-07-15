package com.chumz.letsChatApi.repository;

import com.chumz.letsChatApi.entity.Chat;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ExecutionException;

@Repository
public class ChatRepository {

    public static final String COLLECTION_NAME = "chats";

    public String saveChatMessage(Chat chat) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).document(chat.getId()).set(chat);
        try {
            return collectionsApiFuture.get().getUpdateTime().toString();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error saving chat message", e);
        }

    }
}

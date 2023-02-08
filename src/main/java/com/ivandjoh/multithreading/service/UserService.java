package com.ivandjoh.multithreading.service;

import com.ivandjoh.multithreading.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public interface UserService {
    CompletableFuture<List<User>> saveUsers(MultipartFile file) throws Exception;

    CompletableFuture<List<User>> findAllUsers();
}

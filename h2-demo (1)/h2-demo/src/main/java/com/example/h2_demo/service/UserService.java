package com.example.h2_demo.service;

import com.example.h2_demo.model.User;

import java.util.List;
import java.util.Optional;

public class UserService {
    public User createUser(User user) {
        return user;
    }

    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }

    public List<User> getAllUsers() {
        return List.of();
    }

    public User updateUser(Long id, User user) {
        return user;
    }

    public boolean deleteUser(Long id) {
        return false;
    }
}

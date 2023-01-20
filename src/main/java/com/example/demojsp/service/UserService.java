package com.example.demojsp.service;

import com.example.demojsp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(User user);
    List<User> findAllUsers();
    User findById(Long id);
    void updateUser(User editedUser);
    void deleteUser(Long id);
}

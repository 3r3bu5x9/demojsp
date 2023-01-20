package com.example.demojsp.service;

import com.example.demojsp.model.User;
import com.example.demojsp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        System.out.println(user);
        userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void updateUser(User editedUser) {
        User user = findById(editedUser.getId());
        user.setFirstName(editedUser.getFirstName());
        user.setLastName(editedUser.getLastName());
        user.setEmail(editedUser.getEmail());
        user.setPassword(editedUser.getPassword());
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

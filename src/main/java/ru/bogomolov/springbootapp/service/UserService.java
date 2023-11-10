package ru.bogomolov.springbootapp.service;

import ru.bogomolov.springbootapp.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User findUserById(Long id);

    void deleteUserById(Long id);

    List<User> getAllUsers();
}

package com.example.testprovider.service;

import com.example.testprovider.entity.User;

import java.util.List;

public interface UserService {
    User
    getUserById(String id);

    List<User> getAllUsers();

    User addUser(User user);

    User updateUser(User user);

    void deleteUser(User user);

    void deleteUserById(String userId);


    List<User> listUserNameLike(String name);

    List<User> listUserByNameAndVolume(String name, int volume);

    void updateNameById(String name);
}

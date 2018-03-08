package com.loschidos.servidorcuentasporcobrar.service;

import java.util.List;

import com.loschidos.servidorcuentasporcobrar.entity.User;

public interface UserService {

    User login(String user);
    User addUser(User user);
    List<User> listAllUsers();
    void findById(int id);
    void deleteUserById(int id);

}

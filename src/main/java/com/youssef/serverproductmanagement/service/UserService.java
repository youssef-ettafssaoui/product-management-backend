package com.youssef.serverproductmanagement.service;

import com.youssef.serverproductmanagement.models.Users;

import java.util.List;

public interface UserService {
    Users saveUser(Users user);

    //save = create or update
    Users updateUser(Users user);

    void deleteUser(Long userId);

    Users findByUsername(String username);

    List<Users> findAllUsers();

    Long numberOfUsers();
}

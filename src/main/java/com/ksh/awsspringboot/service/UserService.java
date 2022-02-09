package com.ksh.awsspringboot.service;

import com.ksh.awsspringboot.domain.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getAllUsers();
}

package com.ksh.awsspringboot.service;

import com.ksh.awsspringboot.domain.User;
import com.ksh.awsspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }
}

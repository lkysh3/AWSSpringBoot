package com.ksh.awsspringboot.mapper;

import com.ksh.awsspringboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public User getUser(int id);
    public List<User> getAllUsers();
}

package com.ksh.awsspringboot.mapper;

import com.ksh.awsspringboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUser(int id);
}

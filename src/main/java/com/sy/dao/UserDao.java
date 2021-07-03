package com.sy.dao;

import com.sy.entity.User;

import java.util.List;

public interface UserDao {

    int insertUser(User user);

    List<User> selectUserByCondition(User user);

    User selectUserById(int id);
}

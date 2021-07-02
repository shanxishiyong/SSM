package com.sy.service.Imp;

import com.sy.dao.UserDao;
import com.sy.entity.User;
import com.sy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {

    @Resource
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int insert(User user) {
        int m = userDao.insert(user);
        return m;
    }
}

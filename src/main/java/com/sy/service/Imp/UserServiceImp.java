package com.sy.service.Imp;

import com.sy.dao.UserDao;
import com.sy.entity.User;
import com.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {

    @Resource
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

//    @Autowired
//    private UserDao userDao;   //自动装配实例，与上面@Resource 然后set等价

    public int insertUser(User user) {
        int m = userDao.insertUser(user);
        return m;
    }
}

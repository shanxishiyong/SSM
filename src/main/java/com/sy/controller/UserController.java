package com.sy.controller;

import com.sun.net.httpserver.Authenticator;
import com.sy.entity.User;
import com.sy.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 数据插入user表
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public int insertUser(User user){
        user.setId(UUID.randomUUID().toString().replace("-",""));
        int m = userService.insertUser(user);
        logger.debug("inser end， return value %d"+ m );
        return m;
    }


}

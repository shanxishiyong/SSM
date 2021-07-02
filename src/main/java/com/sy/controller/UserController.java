package com.sy.controller;

import com.sy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@RestController
@RequestMapping(value="/user")
public class UserController {
    private static Logger logger = Logger.getLogger(String.valueOf(UserController.class));

//    @Resource
//    private UserService userService;
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    /**
//     * 数据插入user表
//     */
//    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//    public int insertUser(HttpServletRequest request, HttpServletResponse response){
//        String name = request.getParameter("name");
//        String workMes = request.getParameter("workMes");
//        String age = request.getParameter("age");
//        return 0;
//    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testString(){
        return "this is test";
    }
}

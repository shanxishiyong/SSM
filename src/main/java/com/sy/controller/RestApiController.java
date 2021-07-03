package com.sy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class RestApiController {

    private static Logger logger = Logger.getLogger(String.valueOf(RestApiController.class));

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testString(){
        return "this is test";
    }
}

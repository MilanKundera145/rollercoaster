package com.rollercoaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/userPage")
    public String index(){
        return "userPage";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}

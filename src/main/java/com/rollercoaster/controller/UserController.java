package com.rollercoaster.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rollercoaster.entity.User;
import com.rollercoaster.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userPage")
    public String index(){
        return "userPage";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<User> getAll(){
        QueryWrapper wrapper = new QueryWrapper();
        return this.userService.getBaseMapper().selectList(wrapper);
    }

    @RequestMapping("/all2")
    @ResponseBody
    public List<User> getAll2(){
        return this.userService.selectALL2();
    }
}

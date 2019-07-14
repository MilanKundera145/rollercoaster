package com.rollercoaster.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rollercoaster.entity.User;
import com.rollercoaster.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("api/user")
public class ApiController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ApiOperation("查询所有用户")
    public List<User> getAll(){
        QueryWrapper wrapper = new QueryWrapper();
        return this.userService.getBaseMapper().selectList(wrapper);
    }
}

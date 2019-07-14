package com.rollercoaster.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rollercoaster.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> selectALL2();
}

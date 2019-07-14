package com.rollercoaster.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rollercoaster.dao.UserMapper;
import com.rollercoaster.entity.User;
import com.rollercoaster.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public List<User> selectALL2() {
        return this.baseMapper.selectAll2();
    }
}

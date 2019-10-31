package com.cn.xuetang.service;

import com.cn.xuetang.mapper.UserMapper;
import com.cn.xuetang.po.UserCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional//添加事务.
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insertUser(UserCustom userCustom) {

        return userMapper.insertUser(userCustom);
    }

    public UserCustom loginUser(String u_yhm,String u_paw){
        return userMapper.loginUser(u_yhm,u_paw);
    }

    public int updateUser(UserCustom userCustom){
        return userMapper.updateUser(userCustom);
    }
}

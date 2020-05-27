package com.yuer.dubbo.provider.service.impl;

import com.yuer.dubbo.provider.model.UserModel;
import com.yuer.dubbo.provider.service.UserService;

public class UserServiceImpl implements UserService {


    @Override
    public UserModel call(Integer userId) {
        UserModel userModel = new UserModel();
        userModel.setAge(100);
        userModel.setName("张三丰"+userId);
        userModel.setLevel((int) (Math.random()*100));
        return  userModel;
    }

}

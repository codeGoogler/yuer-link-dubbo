package com.yuer.dubbo.provider.service;

import com.yuer.dubbo.provider.model.UserModel;

public interface UserService {
      UserModel  call(Integer userId);
}

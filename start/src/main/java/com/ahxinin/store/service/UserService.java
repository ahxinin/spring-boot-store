package com.ahxinin.store.service;

import com.ahxinin.store.entity.User;
import com.ahxinin.store.mapper.UserMapper;
import com.ahxinin.store.request.UserLoginRequest;
import com.ahxinin.store.response.UserLoginResponse;
import com.ahxinin.store.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务处理
 * @Author: hexin
 * @Date: 2021/3/2
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserLoginResponse login(UserLoginRequest userLoginRequest){
        User user = userMapper.findByAccount(userLoginRequest.getAccount());
        if (user != null && user.getPassword().equals(userLoginRequest.getPassword())){
            String token = JWTUtil.createToken();
            return UserLoginResponse.builder().id(user.getId()).token(token).build();
        } else {
            return null;
        }
    }
}

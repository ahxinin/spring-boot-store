package com.ahxinin.store.controller;

import com.ahxinin.store.request.UserLoginRequest;
import com.ahxinin.store.response.UserLoginResponse;
import com.ahxinin.store.service.UserService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户接口
 * @Author: hexin
 * @Date: 2021/3/1
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login/v1")
    @ApiOperation(value = "登录")
    public ResponseEntity<String> login(@RequestBody UserLoginRequest userLoginRequest){
        UserLoginResponse response = userService.login(userLoginRequest);
        if (response != null){
            return ResponseEntity.ok(JSONObject.toJSONString(response));
        } else {
            return ResponseEntity.ok("登录失败");
        }
    }
}

package com.ahxinin.store.controller;

import com.ahxinin.store.request.UserLoginRequest;
import com.ahxinin.store.service.UserService;
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
        String response = userService.login(userLoginRequest);
        return ResponseEntity.ok(response);
    }
}

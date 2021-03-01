package com.ahxinin.store.controller;

import com.ahxinin.store.request.UserLoginRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
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

    @PostMapping("login/v1")
    @ApiOperation(value = "登录")
    public ResponseEntity<String> login(@RequestBody UserLoginRequest userLoginRequest){
        return ResponseEntity.ok("login success");
    }
}

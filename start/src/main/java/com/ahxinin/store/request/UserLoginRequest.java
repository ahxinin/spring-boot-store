package com.ahxinin.store.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户登录请求参数
 * @Author: hexin
 * @Date: 2021/3/1
 */
@Data
@ApiModel("用户登录")
public class UserLoginRequest {

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;
}

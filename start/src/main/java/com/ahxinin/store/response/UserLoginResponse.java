package com.ahxinin.store.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: hexin
 * @Date: 2021/3/10
 */
@Data
@Builder
@ApiModel("用户登录返回数据")
public class UserLoginResponse {

    @ApiModelProperty("用户ID")
    private Long id;

    @ApiModelProperty("用户token")
    private String token;
}

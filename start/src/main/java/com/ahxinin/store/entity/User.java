package com.ahxinin.store.entity;

import lombok.Data;

/**
 * 用户信息
 * @Author: hexin
 * @Date: 2021/3/2
 */
@Data
public class User {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户密码
     */
    private String password;
}

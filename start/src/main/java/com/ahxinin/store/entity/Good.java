package com.ahxinin.store.entity;

import lombok.Data;

/**
 * 商品信息
 * @Author: hexin
 * @Date: 2021/3/10
 */
@Data
public class Good {

    /**
     * 商品ID
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品描述
     */
    private String describe;

    /**
     * 商品价格
     */
    private Long price;
}

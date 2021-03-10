package com.ahxinin.store.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: hexin
 * @Date: 2021/3/10
 */
@Data
@ApiModel("商品信息")
public class GoodResponse {

    @ApiModelProperty("商品ID")
    private Long id;

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("商品描述")
    private String describe;

    @ApiModelProperty("商品价格")
    private Long price;
}

package com.ahxinin.store.controller;

import com.ahxinin.store.entity.Good;
import com.ahxinin.store.service.GoodService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品接口
 * @Author: hexin
 * @Date: 2021/3/10
 */
@RestController
@RequestMapping("/api/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @GetMapping("list/v1")
    @ApiOperation(value = "商品列表")
    public ResponseEntity<List<Good>> goodList(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<Good> goodList = goodService.findGoodList(pageNum, pageSize);
        return ResponseEntity.ok(goodList);
    }
}

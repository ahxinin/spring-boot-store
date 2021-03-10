package com.ahxinin.store.service;

import com.ahxinin.store.entity.Good;
import com.ahxinin.store.mapper.GoodMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品业务处理
 * @Author: hexin
 * @Date: 2021/3/10
 */
@Service
public class GoodService {

    @Autowired
    private GoodMapper goodMapper;

    public List<Good> findGoodList(int pageNum, int pageSize){
        int pageStartIndex = (pageNum-1) * pageSize;
        return goodMapper.findByPage(pageStartIndex, pageSize);
    }
}

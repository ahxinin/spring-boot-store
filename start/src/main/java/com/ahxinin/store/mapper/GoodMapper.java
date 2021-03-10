package com.ahxinin.store.mapper;

import com.ahxinin.store.entity.Good;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 商品数据处理
 * @Author: hexin
 * @Date: 2021/3/10
 */
@Mapper
public interface GoodMapper {

    @Select("SELECT * from t_good LIMIT #{pageStartIndex}, #{pageSize}")
    List<Good> findByPage(int pageStartIndex, int pageSize);
}
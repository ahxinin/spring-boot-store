package com.ahxinin.store.mapper;

import com.ahxinin.store.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户信息数据处理
 * @Author: hexin
 * @Date: 2021/3/2
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE account = #{account}")
    User findByAccount(@Param("account") String account);
}
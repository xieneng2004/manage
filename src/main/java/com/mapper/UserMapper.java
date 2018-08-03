package com.mapper;

import org.apache.ibatis.annotations.Param;


/**
 * 用户登录的持久层Mapper接口
 * @author xnx
 */
public interface UserMapper {
    public Integer login(@Param("userName") String userName, @Param("passWord") String passWord);
}

package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Param;


/**
 * 用户登录的持久层Mapper接口
 * @author xnx
 */
public interface UserMapper {
    public Integer login(@Param("userName") String userName, @Param("passWord") String passWord);

    public String findRoles(@Param("userId")Integer userId);

    public String findPermissions(@Param("userId")Integer userId);

    public User getUserInfo(@Param("userName")String userName);
}

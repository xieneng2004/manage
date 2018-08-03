package com.service.impl;


import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务层实现
 * @author xnx
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;

    @Override
    public Integer login(String userName,String passWord){
        return usermapper.login(userName,passWord);
    }
}

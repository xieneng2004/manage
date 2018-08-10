package com.service.impl;


import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

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

    @Override
    public Collection<String> findRoles(User user){
        int userId = user.getUserId();
        Collection<String> roles = null;
        roles.add(usermapper.findRoles(userId));
        return roles;
    }

    @Override
    public Collection<String> findPermissions(User user){
        int userId = user.getUserId();
        Collection<String> permissions = null;
        permissions.add(usermapper.findPermissions(userId));
        return permissions;
    }

    @Override
    public User getUserInfo(String userName){

    }
}

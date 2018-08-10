package com.service;

import com.entity.Role;
import com.entity.User;

import java.util.Collection;

public interface UserService {
    public Integer login(String userName,String passWord);

    public Collection<String> findRoles(User user);

    public Collection<String> findPermissions(User user);

    public User getUserInfo(String userName);
}

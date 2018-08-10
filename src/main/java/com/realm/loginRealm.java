package com.realm;

import com.entity.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Collection;
import java.util.Set;

/**
 * 自定义Realm重写授权和认证
 * AuthorizationInfo代表了角色的权限信息集合，AuthenticationInfo代表了用户的角色信息集合
 */
public class loginRealm extends AuthorizingRealm {
    // 用户对应的角色信息与权限信息都保存在数据库中，通过UserService获取数据
    private UserService userService = new UserServiceImpl();


    //根据用户信息，返回权限信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection){
        User user = (User)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //查询角色信息
        Collection<String> roles = userService.findRoles(user);
        info.addRoles(roles);
        //查询权限信息
        Collection<String> permissions = userService.findPermissions(user);
        info.addStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo dogetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException{
        // 登录流程中应该确保登录的用户信息已经插入AuthenticationToken中，这样才能通过shiro的认证流程
        String userName = token.getPrincipal().toString();
        //虽然在登录流程中我们给的是String，但是shiro中已经写死了密码是个字符数组
        char passWord[] = (char[])token.getCredentials();
        //查询用户名对应的用户信息
        User user = userService
    }

}

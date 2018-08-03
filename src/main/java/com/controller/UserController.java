package com.controller;


import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller层
 * @author xnx
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String login(@RequestParam("username") String userName, @RequestParam("password") String passWord , Model model){
        System.out.println("正在登录:"+userName+","+passWord);
        Integer isExsitUser = userservice.login(userName,passWord);
        if(isExsitUser!=null){
            model.addAttribute("msg","登录成功!");
            return "loginSuccess";
        }
        else {
            model.addAttribute("msg","登录失败，用户不存在！");
            return "loginFaild";
        }

    }
}

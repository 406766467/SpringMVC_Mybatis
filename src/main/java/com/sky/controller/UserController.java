package com.sky.controller;

import com.sky.domain.User;
import com.sky.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(Model model){
        User user = userService.getAllUsers().get(0);
        model.addAttribute("user",user);
        return "showUser";
    }
}
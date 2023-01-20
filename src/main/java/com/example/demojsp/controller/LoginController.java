package com.example.demojsp.controller;

import com.example.demojsp.model.User;
import com.example.demojsp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LoginController {
    UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView showLoginPage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("user", new User());
        return mav;
    }
    @PostMapping("/login")
    public String afterLogin(@ModelAttribute("user")User user){
        List<User> userList = userService.findAllUsers();
        boolean flag = false;
        for (User u:userList){
            if (u.getEmail().compareTo(user.getEmail()) == 0 && u.getPassword().compareTo(user.getPassword()) == 0){
                flag = true;
                break;
            }
        }
        return flag ? "redirect:/userList":"redirect:/login";
    }
}

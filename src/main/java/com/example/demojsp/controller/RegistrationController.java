package com.example.demojsp.controller;

import ch.qos.logback.core.model.Model;
import com.example.demojsp.model.User;
import com.example.demojsp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public ModelAndView showRegistrationPage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register");
        mav.addObject("user", new User());
        return mav;
    }
    @PostMapping("/register")
    public String afterRegistration(@ModelAttribute("user")User user){
        userService.saveUser(user);
        return "redirect:/login";
    }
}

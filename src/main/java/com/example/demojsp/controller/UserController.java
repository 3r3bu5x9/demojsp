package com.example.demojsp.controller;

import com.example.demojsp.model.User;
import com.example.demojsp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userList")
    public ModelAndView showUserList(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userList");
        mav.addObject("users", userService.findAllUsers());
        return mav;
    }
    @GetMapping("/editUser")
    public ModelAndView showEditUserPage(@RequestParam Long id){
        User user = userService.findById(id);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("editUser");
        mav.addObject("user",user);
        return mav;
    }
    @PostMapping("/afterEdit")
    public String afterEdit(@ModelAttribute("user") User editedUser){
        userService.updateUser(editedUser);
        return "redirect:/userList";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam Long id){
        userService.deleteUser(id);
        return "redirect:/userList";
    }
}

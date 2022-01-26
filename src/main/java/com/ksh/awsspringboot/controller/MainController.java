package com.ksh.awsspringboot.controller;

import com.ksh.awsspringboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("value", userService.getUser(1));

        return "index";
    }
}

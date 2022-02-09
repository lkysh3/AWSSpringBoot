package com.ksh.awsspringboot.controller;

import com.ksh.awsspringboot.domain.User;
import com.ksh.awsspringboot.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class MainController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("value", userService.getUser(1));

        return "index";
    }

    @GetMapping("api/allUsers")
    public List<User> allUsers(){
        log.info("From vue used axios");
        return userService.getAllUsers();
    }
}

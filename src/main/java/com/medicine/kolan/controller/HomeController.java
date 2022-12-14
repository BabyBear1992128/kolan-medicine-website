package com.medicine.kolan.controller;

import com.medicine.kolan.model.UserModel;
import com.medicine.kolan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    String appName;

    //
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);

        List<UserModel> userList = userService.findAll();

        for (UserModel user : userList) {
            System.out.println(user.getEmail());
        }


        return "home";
    }

}

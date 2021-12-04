package com.example.springsform.controller;

import com.example.springsform.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("register")
    public String ShowForm(Model model) {
        Users users = new Users();
        model.addAttribute("users", users);

        List<String> professionlist = Arrays.asList("Developer","Designers", "architure");
        model.addAttribute("professions", professionlist);
        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("users") Users users) {
        System.out.println(users);
        return "register_success";
    }
}

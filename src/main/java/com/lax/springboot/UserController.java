package com.lax.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/if-unless")
    public String ifUnlessUser(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Lax","lax@gmail.com","ADMIN"));
        users.add(new User("ANU","ani@gmail.com","USER"));
        users.add(new User("Tony","tony@gmail.com","USER"));
        model.addAttribute("users",users);
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCaseUser(Model model){
        User user = new User("Tony","tony@gmail.com","USER");
        model.addAttribute("user",user);
        return "switch-case";
    }

}

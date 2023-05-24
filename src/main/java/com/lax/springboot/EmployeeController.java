package com.lax.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String iteration(Model model){
        List<Employee> employees =  new ArrayList<>();
        employees.add(new Employee("Lax","Shastrakar","lax@gmail.com"));
        employees.add(new Employee("Anu","Pode","anu@gmail.com"));
        employees.add(new Employee("Tonny","Stark","tonni@gmail.com"));
        employees.add(new Employee("John","babar","jonny@gmail.com"));
        model.addAttribute("employees",employees);
        return "iteration";
    }
}

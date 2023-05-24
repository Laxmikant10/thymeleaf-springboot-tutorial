package com.lax.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello-World!");
        //make sure the return String matches the .html file
        //ex - helloworld = helloworld.html
        return "helloworld";
    }

    @GetMapping("/style")
    public String style() {

        //make sure the return String matches the .html file
        //ex - add-css-js-demo = add-css-js-demo.html
        return "add-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String bootstrap() {

        //make sure the return String matches the .html file
        //ex - add-bootstrap = add-bootstrap.html
        return "add-bootstrap";
    }

    public void m(){
    }
}

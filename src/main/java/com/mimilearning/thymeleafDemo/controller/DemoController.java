package com.mimilearning.thymeleafDemo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DemoController {
    // create mapping for /hello
    @GetMapping("/hello")
    public String sayHello(Model theModel){
        // It takes a Model object as a parameter to pass data to the view.
        theModel.addAttribute("theDate", new java.util.Date());
        // Return view name "HelloWorld" (Thymeleaf template name)
        return "HelloWorld";
    }
}

package com.einsteinsousa.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String value;

    @RequestMapping("/")
    public String index(){
        System.out.println("appName:" + value);
        return "index.html";
    }
    
}

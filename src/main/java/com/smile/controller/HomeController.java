package com.smile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}

package com.smile.controller;

import com.smile.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    static List<Users> list = new ArrayList<>();

    @GetMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("list", list);
        return "users/index";
    }

    @GetMapping("/add")
    public String hello(){
        return "users/add-user";
    }

    @PostMapping("/add")
    public String addSmile(@RequestParam String userName){
        try {
            Users users = new Users();
            users.setUserName(userName);
            list.add(users);
            return "redirect:" + "/user/index";
        } catch (Exception e){
            e.printStackTrace();
        }
        return "users/add-faild";
    }

}

package com.syz.kafka.controller;

import com.google.gson.Gson;
import com.syz.kafka.entity.User;
import com.syz.kafka.service.UserService;
import com.syz.kafka.utils.Errors;
import com.syz.kafka.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("math")
    public String mathPage(){
        return "math";
    }

    @RequestMapping("select")
    public String selectPage(){
        return "selectPage";
    }

    @RequestMapping("animate")
    public String animatePage(){
        return "animatePage";
    }

    @RequestMapping("mouseMove")
    public String mouseMovePage(){
        return "mouseMovePage";
    }

    @RequestMapping("table")
    public String tablePage(){
        return "tablePage";
    }

    @RequestMapping("list")
    public String listPage(Model model){
        model.addAttribute("list",userService.getAll());
        return "listPage";
    }
    @RequestMapping("/")
    public String home(Model model){
        return "homePage";
    }
    @RequestMapping("modal")
    public String modalPage(Model model){
        return "modalPage";
    }
    @RequestMapping("selectClick")
    public String selectClickPage(Model model){
        return "selectClickPage";
    }
    @RequestMapping("divLength")
    public String divLengthPage(Model model){
        return "divLengthPage";
    }
}

package com.syz.kafka.controller;

import com.syz.kafka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("math")
    public String mathPage(){
        return "math";
    }

    @RequestMapping("checkBoxPro")
    public String checkBoxProPage(){
        return "checkBoxProPage";
    }

    @RequestMapping("placeHolder")
    public String placeHolderPage(){
        return "placeHolderPage";
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

    @RequestMapping("relateInput")
    public String relateInputPage(Model model){
        return "relateInputPage";
    }
    @RequestMapping("loopImage")
    public String loopImagePage(Model model){
        return "loopImagePage";
    }
    @RequestMapping("loopPanel")
    public String loopPanelPage(Model model){
        return "loopPanelPage";
    }
    @RequestMapping("elementFind")
    public String elementFindPage(Model model){
        return "elementFindPage";
    }
}

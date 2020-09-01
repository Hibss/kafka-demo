package com.syz.kafka.controller;

import com.google.gson.Gson;
import com.syz.kafka.service.UserService;
import com.syz.kafka.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DataProcessController {

    @Autowired
    private UserService userService;

    @PostMapping("/downloadYTXCalls")
    public RestResponse downloadYTXCalls(HttpServletRequest request){
        String id = request.getParameter("id");
        return RestResponse.createSuccess(new Gson().toJson(userService.getById(Long.parseLong(id))));
    }
}

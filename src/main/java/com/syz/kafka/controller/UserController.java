package com.syz.kafka.controller;

import com.syz.kafka.config.EnvInitConfig;
import com.syz.kafka.entity.User;
import com.syz.kafka.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@Api(tags = "用户接口")
public class UserController {

//    @Autowired
//    private UserStream userStream;

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ApiOperation("输入id，请求用户信息，并发送kafka消息")
    public User getById(@PathVariable("id")Long id){
        User user = userService.getById(id);
        user.setServerName(EnvInitConfig.SERVER);
//        userStream.userOut().send(MessageBuilder.withPayload(user).build());
        return user;
    }

    @GetMapping("userInfo")
    @ApiOperation("输入名称，请求用户信息")
    public List<User> getByName(@RequestParam("name")String name){
        List<User> userList = userService.getByName(name);
        return userList;
    }
}

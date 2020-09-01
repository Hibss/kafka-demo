//package com.syz.kafka.controller;
//
//import com.syz.kafka.constants.MessageConstant;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.stereotype.Component;
//
//@Component
//@EnableBinding(value = UserStream.class)
//@Slf4j
//public class UserReceiver {
//
//    @StreamListener(MessageConstant.USER_INPUT)
//    public void receive(String message){
//        log.info("UserReceiver 接到消息:{}",message);
//    }
//
//    @StreamListener(MessageConstant.USER_OUTPUT)
//    public void send(String message){
//        log.info("UserReceiver 发送消息:{}",message);
//    }
//}

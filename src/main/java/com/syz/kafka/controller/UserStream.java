package com.syz.kafka.controller;


import com.syz.kafka.constants.MessageConstant;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;


public interface UserStream {

    @Input(MessageConstant.USER_INPUT)
    SubscribableChannel userIn();
    @Output(MessageConstant.USER_OUTPUT)
    MessageChannel userOut();

}

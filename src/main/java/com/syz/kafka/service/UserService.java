package com.syz.kafka.service;

import com.syz.kafka.entity.User;
import com.syz.kafka.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getById(Long id) {
        log.info("UserService getById :{}" ,id);
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> getAll() {
        return userMapper.getAll();
    }
}

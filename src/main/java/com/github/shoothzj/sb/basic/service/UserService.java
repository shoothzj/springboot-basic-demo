package com.github.shoothzj.sb.basic.service;

import com.github.shoothzj.sb.basic.module.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author hezhangjian
 */
@Slf4j
@Component
public class UserService {

    @PostConstruct
    public void init() {
        log.info("user service init");
    }

    public void addUser(User user) {

    }

}

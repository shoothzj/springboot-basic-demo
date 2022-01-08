package com.github.shoothzj.sb.basic.controller;

import com.github.shoothzj.sb.basic.module.CreateUserReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhangjian
 */
@Slf4j
@RestController
public class UserController {

    @PostMapping(path = "/user")
    public void addUser(@RequestBody CreateUserReq createUserReq) {

    }

    @DeleteMapping(path = "/user/{userId}")
    public void deleteUser(@PathVariable(value = "userId") String userId) {

    }

}

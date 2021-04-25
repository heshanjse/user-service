package com.hesh.userservice.controller;

import com.hesh.userservice.VO.ResponseTemplateVO;
import com.hesh.userservice.entity.User;
import com.hesh.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("insert saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

}

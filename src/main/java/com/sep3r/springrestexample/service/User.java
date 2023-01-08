package com.sep3r.springrestexample.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/user")
public class User {

    @PostMapping("/userlist")
    List<User> getUserList();
}

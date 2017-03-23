package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserConctroller {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public User getUser(Long id) {
        User user = userService.findById(id);
        return user;
    }
}

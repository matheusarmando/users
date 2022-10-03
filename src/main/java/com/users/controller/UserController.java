package com.users.controller;

import com.users.service.UsersService;
import com.users.model.ListUsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UsersService usersService;

    @GetMapping
    public ListUsersDTO getUsers(){

        return usersService.getAllUsers();
    }
}

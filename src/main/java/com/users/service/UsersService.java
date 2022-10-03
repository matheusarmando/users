package com.users.service;

import com.users.client.UsersClient;
import com.users.model.ListUsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired UsersClient usersClient;


    public ListUsersDTO getAllUsers(){
       return usersClient.getAllUsers();
    }
}

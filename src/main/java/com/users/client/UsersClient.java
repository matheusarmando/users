package com.users.client;

import com.users.model.ListUsersDTO;
import com.users.model.UserDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersClient {

    public ListUsersDTO getAllUsers(){
        var user = UserDTO.builder().id(1).name("Nome do Fulano").email("fulano@f1rst.com.br").build();
        var user2 = UserDTO.builder().id(2).name("Nome do Outro Fulano").email("outrofulano@f1rst.com.br").build();
        List<UserDTO> users = new ArrayList<>();
        users.add(user);
        users.add(user2);

        return ListUsersDTO.builder().users(users).build();

    }

}

package com.users.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListUsersDTO {
    private List<UserDTO> users;
}

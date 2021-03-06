package com.krylov.tasktracker.tasktracker_rest_web_service.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRegistrationRequestDto {

    private String userName;
    private String password;

    private String firstName;
    private String lastName;
    private String email;

}

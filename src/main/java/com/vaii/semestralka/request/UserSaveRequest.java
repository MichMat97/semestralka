package com.vaii.semestralka.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSaveRequest {
    private String name;
    private String surname;
    private Integer age;
    private String email;
    private String login;
    private String password;
}

package com.vaii.semestralka.service;

import com.vaii.semestralka.entity.User;

import java.util.List;


public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

    void updateUser(Long id, String name, String email, String password);

}

//package com.vaii.semestralka.controller;
//
//import com.vaii.semestralka.entity.User;
//import com.vaii.semestralka.request.UserSaveRequest;
//import com.vaii.semestralka.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@RequestMapping(path = "api/v1/users")
//@RequiredArgsConstructor
//public class UserController {
//    @GetMapping
//    public List<User> getUsers() {
//        return userService.getUsers();
//    }
//
//    private final UserService userService;
//
//    @GetMapping("/{id}")
//    public User getUser(@PathVariable UUID id) {
//        return userService.getUser(id);
//    }
//
//
//    @PostMapping("/save")
//    public UUID saveUser(@RequestBody UserSaveRequest request) {
//        return userService.saveUser(request);
//    }
//
//    @DeleteMapping("/vymaz/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void deleteUser(@PathVariable UUID id) {
//        userService.deleteUser(id);
//    }
//
//    @PutMapping("/uprav/{id}")
//    public void updateUser(
//            @PathVariable("id") UUID userID,
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String surname,
//            @RequestParam(required = false) String email
//    ) {
//        userService.updateUser(userID, name, surname, email);
//    }
//
//
//}

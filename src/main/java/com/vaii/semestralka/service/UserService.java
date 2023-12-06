package com.vaii.semestralka.service;

import com.vaii.semestralka.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}

//
//import com.vaii.semestralka.entity.User;
//import com.vaii.semestralka.reposiroty.UserRepository;
//import com.vaii.semestralka.request.UserSaveRequest;
//import jakarta.transaction.Transactional;
//import jakarta.validation.ConstraintViolationException;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//import java.util.UUID;
//
//@Service
//@RequiredArgsConstructor
//public class UserService {
//    private final UserRepository userRepository;
//
//
//    public User getUser(UUID id) {
//        return userRepository.findById(id).get();
//    }
//    public List<User> getUsers() {
//        return userRepository.findAll();
//    }
//
//    public UUID saveUser(UserSaveRequest request) {
//        Optional<User> userOptional = userRepository.findUserByEmali(request.getEmail());
//        if (userOptional.isPresent()) {
//            throw new IllegalStateException("email already registered");
//        } else {
//            User user = new User();
//            user.setName(request.getName());
//            user.setSurname(request.getSurname());
//            user.setAge(request.getAge());
//            user.setEmali(request.getEmail());
//            user.setLogin(request.getLogin());
//            user.setPassword(request.getPassword());
//
//            var savedUser = userRepository.save(user);
//            return savedUser.getId();
//        }
//    }
//
//    public void deleteUser(UUID id) {
//
//        if (!userRepository.existsById(id)) {
//            throw new RuntimeException("Používateľ neexistuje!");
//        } else {
//            userRepository.deleteById(id);
//        }
//    }
//
//    @Transactional
//    public void updateUser(UUID userID, String name, String surname, String email) {
//        User user = userRepository.findById(userID).orElseThrow(() ->
//                new IllegalStateException("Dany pouzivatel neexistuje"));
//        if (name != null && name.length() > 0 && !Objects.equals(user.getName(), name)) {
//            user.setName(name);
//        }
//        if (email != null && email.length() > 0 && !Objects.equals(user.getEmali(), email)) {
//            Optional<User> userOptional = userRepository.findUserByEmali(email);
//            if (userOptional.isPresent()) {
//                throw new IllegalStateException("Zadany email sa uz pouziva");
//            }
//            user.setName(name);
//        }
//    }
//}

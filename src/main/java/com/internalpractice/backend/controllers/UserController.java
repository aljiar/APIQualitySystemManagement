package com.internalpractice.backend.controllers;

import com.internalpractice.backend.entities.User;
import com.internalpractice.backend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Inject
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user){
        userService.storeUser(user);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User getUser(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateUser(@RequestBody User user){
        userService.storeUser(user);
    }


}

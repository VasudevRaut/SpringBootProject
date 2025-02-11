package com.example.firstSpringBootProject.Controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Store user in Redis cache
//    @PostMapping("/users")
//    public String saveUser(@RequestBody User user) {
//
//         userService.saveUser(user);
//         return "Saved";
//    }

    // Retrieve all users from cache
    @GetMapping("/users")
    public String  getAllUsers() {
        return "running";
    }
}

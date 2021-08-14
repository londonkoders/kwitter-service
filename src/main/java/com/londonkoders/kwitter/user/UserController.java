package com.londonkoders.kwitter.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return String.format("Users");
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable Long id) {
        return String.format("User %s", id);
    }

}

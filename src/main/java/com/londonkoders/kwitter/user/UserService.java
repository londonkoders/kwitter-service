package com.londonkoders.kwitter.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();
    Optional<User> getUser(String userId);
}


package com.londonkoders.kwitter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public Optional<User> getUser(long id) {
        return userRepository.findById(id);
    }
}

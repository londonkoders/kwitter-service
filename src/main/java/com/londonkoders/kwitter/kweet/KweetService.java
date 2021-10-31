package com.londonkoders.kwitter.kweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KweetService {
    @Autowired
    KweetRepository kweetRepository;

    public List<Kweet> getKweets() {
        return kweetRepository.findAll();
    }

    public Optional<Kweet> getKweet(long id) {
        return kweetRepository.findById(id);
    }
}

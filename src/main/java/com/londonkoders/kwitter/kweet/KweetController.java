package com.londonkoders.kwitter.kweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class KweetController {

    @Autowired
    KweetService kweetService;

    @GetMapping("/kweets")
    public List<Kweet> getKweets() {
        return kweetService.getKweets();
    }

    @GetMapping("/kweets/{id}")
    public Optional<Kweet> getKweet(@PathVariable Long id) {
        return kweetService.getKweet(id);
    }

}


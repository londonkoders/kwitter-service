package com.londonkoders.kwitter.kweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/kweets")
    public Kweet createKweet(@RequestBody Kweet kweet) {
        return kweetService.createKweet(kweet);
    }

    @PutMapping("/kweets/{id}")
    public Kweet updateKweetContent(@RequestBody Kweet kweet, @PathVariable Long id) {
        return kweetService.updateKweetContent(kweet.getContent(), id);
    }

    @PutMapping("/kweets/{id}/like")
    public Kweet likeKweet(@PathVariable Long id) {
        return kweetService.likeKweet(id);
    }

    @DeleteMapping("/kweets/{id}")
    public void deleteKweet(@PathVariable Long id) {
        kweetService.deleteKweet(id);
    }
}


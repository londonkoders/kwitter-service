package com.londonkoders.kwitter.kweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class KweetService {
    @Autowired
    KweetRepository kweetRepository;

    public List<Kweet> getKweets() {
        return kweetRepository.findAll();
    }

    public Optional<Kweet> getKweet(Long id) {
        return kweetRepository.findById(id);
    }

    public Kweet createKweet(Kweet kweet) {
        return kweetRepository.saveAndFlush(kweet);
    }

    public Kweet likeKweet(long id) {
        return kweetRepository.findById(id)
                .map(kweet -> {
                    kweet.setLikes(kweet.getLikes() + 1);
                    return kweetRepository.saveAndFlush(kweet);
                }).orElseThrow(() -> new KweetNotFoundException(id));
    }

    public Kweet updateKweetContent(String content, long id) {
        return kweetRepository.findById(id)
                .map(kweet -> {
                    kweet.setContent(content);
                    kweet.setUpdatedDate(new Date(System.currentTimeMillis()));
                    return kweetRepository.saveAndFlush(kweet);
                }).orElseThrow(() -> new KweetNotFoundException(id));
    }

    public void deleteKweet(Long id) {
        kweetRepository.deleteById(id);
    }
}

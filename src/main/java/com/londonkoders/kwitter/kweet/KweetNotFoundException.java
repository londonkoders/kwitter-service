package com.londonkoders.kwitter.kweet;

public class KweetNotFoundException extends RuntimeException {
    KweetNotFoundException(Long id) {
        super("Could not find kweet " + id);
    }
}

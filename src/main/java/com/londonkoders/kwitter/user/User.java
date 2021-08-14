package com.londonkoders.kwitter.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    private String password;

    private String name;

}

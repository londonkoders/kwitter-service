package com.londonkoders.kwitter.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.londonkoders.kwitter.kweet.Kweet;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private long id;

    private String userId;

    private String password;

    private String name;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Kweet> kweet;
}

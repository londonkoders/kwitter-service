package com.londonkoders.kwitter.kweet;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.londonkoders.kwitter.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "kweets")
@Getter
@Setter
public class Kweet {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    private long likes;

    private String content;

    private Date createdDate;

    private Date updatedDate;
}

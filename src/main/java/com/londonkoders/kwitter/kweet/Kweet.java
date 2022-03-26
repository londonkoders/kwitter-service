package com.londonkoders.kwitter.kweet;

import com.londonkoders.kwitter.user.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "kweets")
@Getter
@Setter
public class Kweet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User author;

    private long likes;

    private String content;

    @Column(name = "createdDate")
    @CreationTimestamp
    private Date kweetedAt;

    @CreationTimestamp
    private Date updatedDate;
}

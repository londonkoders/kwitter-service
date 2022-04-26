package com.londonkoders.kwitter.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "name")
    private String displayName;

    @JsonProperty("userId")
    @Column(name = "userId")
    private String kwitterHandle;

    private String bio;

    @Transient
    private String profileImageUrl;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Kweet> kweet;

    private void setProfileImageUrl() {
        profileImageUrl = "https://ohfun.net/contents/article/images/2019/0701/1561972645906397.jpg";
    }

    public String getProfileImageUrl() {
        if (profileImageUrl == null) {
            setProfileImageUrl();
        }
        return profileImageUrl;
    }
}

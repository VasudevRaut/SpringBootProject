package com.example.firstSpringBootProject.Controller;

import java.io.Serializable;
import jakarta.persistence.*;
import org.springframework.data.redis.core.RedisHash;

@Entity
@RedisHash("User") // Marks this entity to be stored in Redis

public class User implements Serializable {

    @Id
    private Long id;
    private String name;
    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

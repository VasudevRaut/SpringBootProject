package com.example.firstSpringBootProject.Controller;

import com.example.firstSpringBootProject.Controller.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {

    private final Map<Long, User> userCache = new ConcurrentHashMap<>();

    @CachePut(value = "users", key = "#user.id")
    public User saveUser(User user) {
        userCache.put(user.getId(), user);
        return user;
    }

    @Cacheable(value = "users")
    public List<User> getAllUsers() {
        return new ArrayList<>(userCache.values());
    }
}

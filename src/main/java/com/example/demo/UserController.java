package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final List<User> userList = Arrays.asList(
        new User(1L, "John Doe", 25, "john@example.com", "123 Main St", "555-1234", "555-5678"),
        new User(2L, "Jane Smith", 30, "jane@example.com", "456 Oak Ave", "555-2345", "555-6789"),
        new User(3L, "Bob Johnson", 35, "bob@example.com", "789 Pine Rd", "555-3456", "555-7890")
    );

    @GetMapping
    public List<User> getUserList() {
        return userList;
    }

    @GetMapping("/{id}")
    public User getUserDetail(@PathVariable Long id) {
        return userList.stream()
            .filter(user -> user.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
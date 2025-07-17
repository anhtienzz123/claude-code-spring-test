package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * REST controller for managing user operations.
 * 
 * This controller provides endpoints for retrieving user information from a
 * static in-memory list. It handles HTTP requests for user-related operations
 * and returns JSON responses.
 * 
 * Base URL: /users
 * 
 * @author Demo Application
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * Static in-memory storage for user data.
     * 
     * This list contains sample user data for demonstration purposes.
     * In a real application, this would typically be replaced with
     * database access through a repository or service layer.
     * 
     * The list is immutable and contains three sample users with
     * different personal information for testing the API endpoints.
     */
    private static final List<User> userList = Arrays.asList(
        new User(1L, "John Doe", 25, "john@example.com", "123 Main St", "555-1234", "555-5678"),
        new User(2L, "Jane Smith", 30, "jane@example.com", "456 Oak Ave", "555-2345", "555-6789"),
        new User(3L, "Bob Johnson", 35, "bob@example.com", "789 Pine Rd", "555-3456", "555-7890")
    );

    /**
     * Retrieves all users from the user list.
     * 
     * This endpoint returns a complete list of all users stored in the system.
     * The users are returned as a JSON array containing user objects with
     * all their properties (id, name, age, email, address, phone).
     * 
     * HTTP Method: GET
     * URL: /users
     * 
     * Example request:
     * GET /users
     * 
     * Example response:
     * [
     *   {
     *     "id": 1,
     *     "name": "John Doe",
     *     "age": 25,
     *     "email": "john@example.com",
     *     "address": "123 Main St",
     *     "phone": "555-1234"
     *   },
     *   {
     *     "id": 2,
     *     "name": "Jane Smith",
     *     "age": 30,
     *     "email": "jane@example.com",
     *     "address": "456 Oak Ave",
     *     "phone": "555-2345"
     *   }
     * ]
     * 
     * @return List of all users in the system
     */
    @GetMapping
    public List<User> getUserList() {
        return userList;
    }

    /**
     * Retrieves a specific user by their unique identifier.
     * 
     * This endpoint searches for a user with the specified ID and returns
     * their complete information. If no user is found with the given ID,
     * the method returns null, which translates to a 404 Not Found response.
     * 
     * HTTP Method: GET
     * URL: /users/{id}
     * 
     * Example request:
     * GET /users/1
     * 
     * Example successful response (200 OK):
     * {
     *   "id": 1,
     *   "name": "John Doe",
     *   "age": 25,
     *   "email": "john@example.com",
     *   "address": "123 Main St",
     *   "phone": "555-1234"
     * }
     * 
     * Example not found response (404 Not Found):
     * GET /users/999 returns null
     * 
     * @param id the unique identifier of the user to retrieve (must be a valid Long value)
     * @return the user object with the specified ID, or null if no user exists with that ID
     * @throws NumberFormatException if the provided ID cannot be parsed as a Long
     */
    @GetMapping("/{id}")
    public User getUserDetail(@PathVariable Long id) {
        return userList.stream()
            .filter(user -> user.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
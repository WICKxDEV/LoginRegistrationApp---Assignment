package com.yourpackage.model;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    // Constructors, getters, and setters
    public User() {}
    
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Add all getters and setters here
}
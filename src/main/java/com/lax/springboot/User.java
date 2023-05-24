package com.lax.springboot;

import lombok.Data;

@Data
public class User {

    private String userName;
    private String email;
    private String role;

    public User(String userName, String email, String role) {
        this.userName = userName;
        this.email = email;
        this.role = role;
    }
}

package com.example.gachahub.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String Email;
    private String Password;
    private String Username;

    public String getEmail() { return Email;}
    public void setEmail(String email) { Email = email; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPassword() { return Password; }
    public void setPassword(String password) { Password = password; }

    public String getUsername() { return Username;}
    public void setUsername(String username) { Username = username;}

}

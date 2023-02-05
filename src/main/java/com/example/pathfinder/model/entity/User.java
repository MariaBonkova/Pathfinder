package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.entity.enums.LevelEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
    //1⦁	username - Accepts String values
    //⦁	Accepts values, which should be at least 2 characters
    //2⦁	password - Accepts String values
    //⦁	Accepts values, which should be at least 2 characters
    //3⦁	email - Accepts String values
    //⦁	Accepts values, which contain the '@' symbol
    //4⦁	role - Accepts Role Entity values
    //⦁	Each registered user should have a "User" role
    //5⦁	level - Accepts a level of the user (BEGINNER, INTERMEDIATE, ADVANCED)

    private String userName;
    private String fullName;
    private Integer age;
    private String password;
    private String email;
    private Set<Role> roles;
    private LevelEnum level;

    public User() {
    }
@Column(name = "username", nullable = false,unique = true)
    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    @Column(name = "full_name",nullable = false)
    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
@Column
    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }
@Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
@Email
    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    @ManyToMany
    public Set<Role> getRoles() {
        return roles;
    }

    public User setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }


@Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public User setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }
}

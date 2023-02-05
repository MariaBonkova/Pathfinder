package com.example.pathfinder.model.service;

import com.example.pathfinder.model.entity.Role;
import com.example.pathfinder.model.entity.enums.LevelEnum;

import java.util.Set;

public class UserServiceModel {

    private Long id;
    private String userName;
    private String fullName;
    private Integer age;
    private String password;
    private String email;
    private Set<Role> roles;
    private LevelEnum level;

    public UserServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public UserServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserServiceModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserServiceModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserServiceModel setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public UserServiceModel setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public UserServiceModel setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }
}

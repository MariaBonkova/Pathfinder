package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.entity.enums.RoleNameEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity{
    //⦁	id - Accepts UUID String or Long values
    //⦁	name - Accepts String values 
    //⦁	USER, MODERATOR and ADMIN

    private RoleNameEnum role;

    public Role() {
    }
    @Enumerated(EnumType.STRING)
    public RoleNameEnum getRole() {
        return role;
    }

    public Role setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }





}

package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.entity.enums.CategoryNameEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories extends BaseEntity{
    //⦁	name - Accepts String values (PEDESTRIAN, BICYCLE, MOTORCYCLE, CAR)
    //⦁	description - Accepts very long String values

    private CategoryNameEnum name;
    private String description;

    public Categories() {
    }
@Enumerated(EnumType.STRING)
@Column(name = "name",nullable = false,unique = true)
    public CategoryNameEnum getName() {
        return name;
    }

    public Categories setName(CategoryNameEnum name) {
        this.name = name;
        return this;
    }
@Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Categories setDescription(String description) {
        this.description = description;
        return this;
    }
}

package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.entity.enums.LevelEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity{
    //⦁	gpx coordinates - Accepts very long text values
    //⦁	level - Accepts the levels of the routes (BEGINNER, INTERMEDIATE, ADVANCED) as values
    //⦁	name - Accepts String values
    //⦁	author - Accepts User Entities as values
    //⦁	video url – Accepts the ids of youtube videos as values
    private String gpxCoordinates;
    private LevelEnum level;
    private String name;
    private User author;
    private String videoUrl;
    private String description;
    private Set<Categories> categories;

    public Route() {
    }


@Column(columnDefinition = "LONGTEXT")
    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public Route setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }
@Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public Route setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }
@Column(nullable = false,unique = true)
    public String getName() {
        return name;
    }

    public Route setName(String name) {
        this.name = name;
        return this;
    }

@Column
    public String getVideoUrl() {
        return videoUrl;
    }

    public Route setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
@Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Route setDescription(String description) {
        this.description = description;
        return this;
    }
@ManyToMany
    public Set<Categories> getCategories() {
        return categories;
    }

    public Route setCategories(Set<Categories> categories) {
        this.categories = categories;
        return this;
    }
    @ManyToOne
    @JoinColumn(name = "author_id")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}

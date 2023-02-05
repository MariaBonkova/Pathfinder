package com.example.pathfinder.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comments extends BaseEntity{
    //⦁	approved - Accepts boolean values
    //⦁	created - Accepts Date and Time values
    //⦁	 The values should not be future dates
    //⦁	text content - Accepts very long text values
    //⦁	author - Accepts User Entities as values
    //⦁	route - Accepts Route Entities as values

    private boolean approved;
   private LocalDateTime created;
   private String textContent;
   private User author;
   private Route route;

    public Comments() {
    }
@Column(nullable = false)
    public boolean isApproved() {
        return approved;
    }

    public Comments setApproved(boolean approved) {
        this.approved = approved;
        return this;
    }
    @Column(nullable = false, name = "created")
    public LocalDateTime getCreated() {
        return created;
    }

    public Comments setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }
    @Column(nullable = false, columnDefinition = "TEXT")
    public String getTextContent() {
        return textContent;
    }

    public Comments setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
@ManyToOne
    public User getAuthor() {
        return author;
    }

    public Comments setAuthor(User author) {
        this.author = author;
        return this;
    }
@ManyToOne
    public Route getRoute() {
        return route;
    }

    public Comments setRoute(Route route) {
        this.route = route;
        return this;
    }
}

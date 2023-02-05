package com.example.pathfinder.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Messages extends BaseEntity{
    //⦁	id - Accepts UUID String or Long values 
    //⦁	date time - Accepts Date and Time values
    //⦁	text content - Accepts very long String values
    //⦁	author - Accepts User Entities as values
    //⦁	recipient - Accepts User Entities as values
    private LocalDateTime dateTime;
    private String  textContent;
    private User author;
    private User recipient;

    public Messages() {
    }
@Column(name = "date_time",nullable = false)
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Messages setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }
@Column(columnDefinition = "TEXT")
    public String getTextContent() {
        return textContent;
    }

    public Messages setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
@ManyToOne
    public User getAuthor() {
        return author;
    }

    public Messages setAuthor(User author) {
        this.author = author;
        return this;
    }
@ManyToOne
    public User getRecipient() {
        return recipient;
    }

    public Messages setRecipient(User recipient) {
        this.recipient = recipient;
        return this;
    }
}

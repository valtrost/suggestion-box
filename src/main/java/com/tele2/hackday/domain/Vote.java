package com.tele2.hackday.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vote {
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String text;
    private int vote;

    public Vote() {
    }

    public Vote(String text, int vote) {
        this.text = text;
        this.vote = vote;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
    
}

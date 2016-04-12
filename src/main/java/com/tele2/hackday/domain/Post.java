package com.tele2.hackday.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "submissions")
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String type,content,placeholder;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Vote> votes;     

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public Post() {
    }

    public Post(String type, String content, String placeholder) {
        this.type = type;
        this.content = content;
        this.placeholder = placeholder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public double getPopularity() {
        double sum = 0;
        double count = 0;
        if (votes != null) {
            for (Vote v : votes) {
                if (v.getVote() == 0) {
                    continue;
                }
                sum = sum + v.getVote();
                count = count + 1;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }
}

package com.tele2.hackday.service;

import com.tele2.hackday.domain.Post;
import com.tele2.hackday.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DashboardService {

    @Autowired
    private PostRepository repository;
    
    public Iterable<Post> getList(){
        return null;
    } 
}

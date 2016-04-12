package com.tele2.hackday.repository;

import com.tele2.hackday.domain.Post;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{
    
}

package com.test.newsserver.service;

import com.test.newsserver.entities.Post;
import com.test.newsserver.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImp implements PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savepost (Post post){
       post.setLikecount(0);
       post.setViewcount(0);
       post.setDate(new Date());
       return postRepository.save(post);

    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post getPostById(Long id){
        Optional<Post> optionalPost = postRepository.findById(id);
        if(optionalPost.isPresent()){
            Post post = optionalPost.get();
            post.setViewcount(post.getViewcount()+1);
            return postRepository.save(post);
        } else {
            throw new EntityNotFoundException("Post id " + id + " not found");
        }
    }
}

package com.test.newsserver.controller;

import com.test.newsserver.entities.Post;
import com.test.newsserver.service.PostService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody Post post) {
        try{
            Post createPost = postService.savepost(post);
            return ResponseEntity.status(HttpStatus.CREATED).body(createPost);
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

            }
            @GetMapping
            public ResponseEntity <List<Post>> getAllPosts() {
                try {
                    return ResponseEntity.status(HttpStatus.OK).body(postService.getAllPosts());
                }catch (Exception e0){
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                }

            }
            @GetMapping("/{id}")
            public  ResponseEntity <?> getPostById(@PathVariable Long id) {
        try{
            Post post = postService.getPostById(id);
            return ResponseEntity.status(HttpStatus.OK).body(post);
        } catch (EntityNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
            }
}

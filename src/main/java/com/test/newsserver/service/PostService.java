package com.test.newsserver.service;

import com.test.newsserver.entities.Post;

import java.util.List;

public interface PostService {

    Post savepost (Post post);
    List<Post> getAllPosts();

    Post getPostById(Long id);

}

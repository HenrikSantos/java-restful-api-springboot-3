package com.henrik.javarestfulapiwithspringboot3.services;

import com.henrik.javarestfulapiwithspringboot3.models.PostModel;
import com.henrik.javarestfulapiwithspringboot3.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public List<PostModel> getAllPosts() {
        return postRepository.findAll();
    }

    public PostModel createPost(PostModel post) {
        return postRepository.save(post);
    }
}

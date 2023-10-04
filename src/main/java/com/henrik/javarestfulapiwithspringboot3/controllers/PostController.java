package com.henrik.javarestfulapiwithspringboot3.controllers;

import com.henrik.javarestfulapiwithspringboot3.models.PostModel;
import com.henrik.javarestfulapiwithspringboot3.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/post")
@Tag(name = "Post API", description = "Endpoint for managing posts.")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping("")
    public ResponseEntity<List<PostModel>> getPosts() {
        return ResponseEntity.ok(postService.getAllPosts());
    }

    @PostMapping("")
    public ResponseEntity<PostModel> createPost(@RequestBody PostModel post) {
        return ResponseEntity.ok(postService.createPost(post));
    }
}

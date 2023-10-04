package com.henrik.javarestfulapiwithspringboot3.controllers;

import com.henrik.javarestfulapiwithspringboot3.models.PostModel;
import com.henrik.javarestfulapiwithspringboot3.models.SubredditModel;
import com.henrik.javarestfulapiwithspringboot3.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> getPostById(@RequestParam String id) {
        PostModel response = postService.getPostById(id);
        if (response == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("post not found");
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("")
    public ResponseEntity<PostModel> createPost(@RequestBody PostModel post) {
        return ResponseEntity.ok(postService.createPost(post));
    }
}

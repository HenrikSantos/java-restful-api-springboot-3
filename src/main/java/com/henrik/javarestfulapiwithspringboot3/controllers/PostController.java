package com.henrik.javarestfulapiwithspringboot3.controllers;

import com.henrik.javarestfulapiwithspringboot3.models.PostModel;
import com.henrik.javarestfulapiwithspringboot3.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/post")
@Tag(name = "Post API", description = "RESTful API for managing posts.")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping("/")
    public ResponseEntity<List<PostModel>> getPosts() {
        return ResponseEntity.ok(postService.getAll());
    }
}

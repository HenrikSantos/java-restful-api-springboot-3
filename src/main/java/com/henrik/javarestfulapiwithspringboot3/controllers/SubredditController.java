package com.henrik.javarestfulapiwithspringboot3.controllers;

import com.henrik.javarestfulapiwithspringboot3.models.SubredditModel;
import com.henrik.javarestfulapiwithspringboot3.services.SubredditService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subreddit")
@Tag(name = "Subreddit API", description = "Endpoint for managing subreddits.")
public class SubredditController {
    @Autowired
    SubredditService subredditService;
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        SubredditModel response = subredditService.getSubredditById(id);
        if (response == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("subreddit not found");
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("")
    public ResponseEntity<SubredditModel> createReddit(@RequestBody SubredditModel newSubreddit) {
        return ResponseEntity.ok(subredditService.createReddit(newSubreddit));
    }
}

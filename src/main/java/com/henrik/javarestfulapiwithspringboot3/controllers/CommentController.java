package com.henrik.javarestfulapiwithspringboot3.controllers;

import com.henrik.javarestfulapiwithspringboot3.models.CommentModel;
import com.henrik.javarestfulapiwithspringboot3.services.CommentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@Tag(name = "Comment API", description = "Endpoint for managing comments.")
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("")
    public ResponseEntity<List<CommentModel>> getAllComments() {
        return ResponseEntity.ok(commentService.getAllComments());
    }

    @PostMapping("")
    public ResponseEntity<CommentModel> createComment(@RequestBody CommentModel newComment) {
        return ResponseEntity.ok(commentService.createComment(newComment));
    }
}

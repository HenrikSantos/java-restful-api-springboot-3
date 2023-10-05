package com.henrik.javarestfulapiwithspringboot3.services;

import com.henrik.javarestfulapiwithspringboot3.models.CommentModel;
import com.henrik.javarestfulapiwithspringboot3.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public List<CommentModel> getAllComments() {
        return commentRepository.findAll();
    }
    public CommentModel createComment(CommentModel newComment) {
        return commentRepository.save(newComment);
    }
}

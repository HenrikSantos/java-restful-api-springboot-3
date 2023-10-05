package com.henrik.javarestfulapiwithspringboot3.services;

import com.henrik.javarestfulapiwithspringboot3.models.PostModel;
import com.henrik.javarestfulapiwithspringboot3.models.SubredditModel;
import com.henrik.javarestfulapiwithspringboot3.repositories.SubredditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubredditService {
    @Autowired
    SubredditRepository subredditRepository;

    public SubredditModel getSubredditById(String id) {
        return subredditRepository.findById(id).orElse(null);
    }

    public SubredditModel createReddit(SubredditModel newSubreddit) {
        return subredditRepository.save(newSubreddit);
    }

    public List<SubredditModel> getAllSubreddits() {
        return subredditRepository.findAll();
    }
}

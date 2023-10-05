package com.henrik.javarestfulapiwithspringboot3.models;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Subreddit")
public class SubredditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "subreddit_id")
    private String subredditId;
    private String name;
    private String image;

    @OneToMany(mappedBy = "subreddit", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PostModel> posts;

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }
}

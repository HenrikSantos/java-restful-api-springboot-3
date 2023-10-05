package com.henrik.javarestfulapiwithspringboot3.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Post")
public class PostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "post_id")
    private String postId;

    private String title;

    @Column(name = "post_comment")
    private String postComment;

    @Column(unique = true)
    private String author;

    @ManyToOne
    @JoinColumn(name = "subreddit_id")
    private SubredditModel subreddit;

    @Column(columnDefinition = "default 0")
    private Integer score;

    private String img;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CommentModel> comments = new ArrayList<>();

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostComment() {
        return postComment;
    }

    public void setPostComment(String postComment) {
        this.postComment = postComment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public SubredditModel getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(SubredditModel subreddit) {
        this.subreddit = subreddit;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }
}

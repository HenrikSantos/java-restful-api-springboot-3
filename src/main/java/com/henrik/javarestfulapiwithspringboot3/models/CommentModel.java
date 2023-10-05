package com.henrik.javarestfulapiwithspringboot3.models;

import jakarta.persistence.*;

@Entity(name = "Comment")
public class CommentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "comment_id")
    private String commentId;

    @Column(name= "comment_author")
    private String commentAuthor;

    @Column(name = "comment_text")
    private String commentText;

    @Column(name = "comment_score")
    private Integer commentScore;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostModel post;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Integer commentScore) {
        this.commentScore = commentScore;
    }

    public PostModel getPost() {
        return post;
    }

    public void setPost(PostModel post) {
        this.post = post;
    }
}

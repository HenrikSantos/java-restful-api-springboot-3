package com.henrik.javarestfulapiwithspringboot3.repositories;

import com.henrik.javarestfulapiwithspringboot3.models.CommentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentModel, String> {
}

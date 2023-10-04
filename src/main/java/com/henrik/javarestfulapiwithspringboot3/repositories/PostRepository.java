package com.henrik.javarestfulapiwithspringboot3.repositories;

import com.henrik.javarestfulapiwithspringboot3.models.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostModel, String> {
}

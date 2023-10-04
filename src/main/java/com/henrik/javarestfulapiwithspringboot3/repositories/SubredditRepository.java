package com.henrik.javarestfulapiwithspringboot3.repositories;

import com.henrik.javarestfulapiwithspringboot3.models.SubredditModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<SubredditModel, String> {
}

package com.pinsoft.blogsite.repository;

import com.pinsoft.blogsite.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByHeader(String header);
    Post findByCategory(String category);
}

package com.david.facebookapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Additional query methods can be added here if needed.
}
package com.april.todolistmine.post;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    //SELECT * FROM POST WHERE SUBJECT = ?
    List<Post> findBySubject(String subject);
}

package com.april.todolistmine.post;

import org.springframework.stereotype.Service;

import static java.lang.String.format;


@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post save(Post post) {
        Post savedPost = this.postRepository.save(post);
        savedPost.initCreateDate();
        String subject = format("%s. %s", savedPost.getId(), savedPost.getSubject());
        savedPost.setSubject(subject);
        this.postRepository.save(savedPost);
        return savedPost;
    }
}

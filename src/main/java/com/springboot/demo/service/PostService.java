package com.springboot.demo.service;

import com.springboot.demo.model.Post;
import com.springboot.demo.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostService {
    private PostRepository postRepository;

    public String find(int postId){
     postRepository.selectPost(postId);
        return "";
    }
}

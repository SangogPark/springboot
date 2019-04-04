package com.springboot.demo.repository;

import com.springboot.demo.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostRepository {


    Post selectPost(@Param("postId") int postId);
}
package com.springboot.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Slf4j
@Getter
public class Post {
    private int postId;
    private String title;
    //todo get/set 어노테이션으로 변경
    public String getTitle(){
        return title;
    }
}

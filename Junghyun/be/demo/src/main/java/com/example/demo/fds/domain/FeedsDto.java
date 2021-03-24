package com.example.demo.fds.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class FeedsDto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private long feedNo;
    private String title;
    private String writer;
    private String content;
    private String addLocation;
    private String hashTag;
}

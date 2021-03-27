package com.example.demo.fds.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class FeedsDto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private long feedNo;
    private String title;
    private String writer;
    private String content;
    private String addLocation;
    private String hashTag;
    private String regDate;
    
    @Builder
	public FeedsDto(long feedNo, String title, String writer, String content, String addLocation, String hashTag,
			String regDate) {
		super();
		this.feedNo = feedNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.addLocation = addLocation;
		this.hashTag = hashTag;
		this.regDate = regDate;
	}
    
    
}

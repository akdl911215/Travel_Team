package com.example.demo.fds.domain;

import javax.persistence.*;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "feeds")
public class Feeds {
    @Id
    @GeneratedValue

    @Column(name = "feed_no")
    private long feedNo;
    @Column(name = "title")
    private String title;
    @Column(name = "writer")
    private String writer;
    @Column(name = "content")
    private String content;
    @Column(name = "add_location")
    private String addLocation;
    @Column(name = "hash_tag")
    private String hashTag;
    @Column(name = "reg_date")
    private String regDate;
    
    @Builder
	public Feeds(long feedNo, String title, String writer, String content, String addLocation, String hashTag,
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

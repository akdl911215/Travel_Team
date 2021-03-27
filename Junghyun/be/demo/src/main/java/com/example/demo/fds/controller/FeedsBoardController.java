package com.example.demo.fds.controller;

import java.util.List;

import com.example.demo.fds.domain.Feeds;
import com.example.demo.fds.repository.FeedsBoardRepository;
import com.example.demo.fds.service.FeedsBoardServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RequiredArgsConstructor
@RestController
@RequestMapping("/feeds")
@CrossOrigin(origins="*")
public class FeedsBoardController {

    private final FeedsBoardServiceImpl service;

    @PostMapping("/create")
    public ResponseEntity<?>save(
    		@RequestBody Feeds feeds){
    	log.info("등록완료");
    	service.save(feeds);
    	
    	log.info("register feeds number = " + feeds.getFeedNo());
    	return new ResponseEntity<>(HttpStatus.OK);
    }


}

package com.example.demo.fds.controller;

import java.util.List;

import com.example.demo.fds.domain.Feeds;
import com.example.demo.fds.repository.FeedsBoardRepository;
import com.example.demo.fds.service.FeedsBoardServiceImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/feeds")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class FeedsBoardController {

    private final FeedsBoardServiceImpl service;

    @RequestMapping(value = "/{feedNo}")
    public ResponseEntity<Feeds> read(
        @RequestBody Feeds feeds) throws Exception {

            return null;
        }


}

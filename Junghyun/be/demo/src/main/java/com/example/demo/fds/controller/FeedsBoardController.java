package com.example.demo.fds.controller;

import java.util.List;

import com.example.demo.fds.domain.Feeds;
import com.example.demo.fds.service.FeedsBoardServiceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jdk.internal.jline.internal.Log;

@RestController
@RequestMapping("/feeds")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class FeedsBoardController {

    private final FeedsBoardServiceImpl service;

    @RequestMapping(value = "/{feedNo}")
    public ResponseEntity<Feeds> read(
        @RequestBody Feeds feeds) throws Exception {

            Log.info("Feeds read()");

            return null;
        }

    @RequestMapping(value = "")
    public ResponseEntity<List<Feeds>>list() throws Exception {
        Log.info("Feeds list()");

        return null;
    }

    @RequestMapping(value = "")
    public ResponseEntity<Feeds> register(
               @RequestBody Feeds feeds) throws Exception {

        Log.info("Feeds register");

        return null;
    }

    @RequestMapping(value = "")
    public ResponseEntity<Void> remove(
             @RequestBody Feeds feeds) throws Exception {

         Log.info("remove");

        return null;
    }

    @RequestMapping(value = "")
    public ResponseEntity<Feeds> modify(
        @RequestBody Feeds feeds) throws Exception {
        
        Log.info("modify");

        return null;
    }
}

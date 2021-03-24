package com.example.demo.fds.controller;

import com.example.demo.fds.service.FeedService;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import jdk.internal.jline.internal.Log;

@RestController
@RequestMapping("/feeds")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class FeedsBoardController {

    private final FeedService  Service;

    @GetMapping(value = "/{boardNo}", method = RequestMethod.GET)
    public ResponseEntity<FeedsBoard> read(
        @PathVariable("boardNo") Long boardNo) throws Exception {

            log.info("FeedsBoard read()");

            FeedsBoard board = service.read(BoardNo);

            return new ResponseEntity<FeedsBoard>(board, HttpStatus.OK);
        }

    @GetMapping(value = "", method = RequestMethod.GET)
    pulbic ResponseEntity<List<FeedsBoard>> list() throws Exception {
        Log.info("FeedsBoard list()");

        return new ResponseEntity<> (
            service.list(), HttpStatus.OK);
    }

    @GetMapping(values = "", method = RequestMethod.POST)
    public ResponseEntity<FeedsBoard> register(
                @Validated @RequestBody FeedsBoard board,
                UriComponentsBuilder uriBuider) throws Exception {

            Log.info(FeedsBoard register);

            service.register(board);

            log.info("Register bpard.getFeedsNo() = " + board.getFeedsNo());
                    
            return new ResponseEntity<>(board, HttpStatus.OK);
        }

    @GetMapping(value = "/{boardNo}", method = RequestMapping.DELETE)
    public ResponseEntity<Void> remove(
                @PathVariable("boardNo") Long boardNo) throws Exception {

                    Log.info("remove");

                    service.remove(boardNo);

                    return new ResponseEntity<void>(HttpStatus.NO_CONETENT);
        
        }

    @GetMapping(value = "/{boardNo}", method = RequestMethod.PUT)
    public ResponseEntity<FeedsBoard> modify(
                @PathVariable("boardNo") Long boardNo) throws Exception {

            Log.info("remove");

            service.remove(boardNo);

            return new ResponseEntity<Void>(HttpStatus.SC_NO_CONTENT);
        }

    @GetMapping(value = "/{boardNo}", method = RequestMethod.PUT)
    public ResponseEntity<FeedsBoard> modify(
                @PathVariable("boardNo") Long boardNO,
                @Validated @RequestBody FeedsBoard board) throws Exception {
        
        log.info("modify");

        board.setBoardNo(boardNo);
        service.modify(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}

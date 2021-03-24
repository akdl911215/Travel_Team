package com.example.demo.its.controller;

import com.example.demo.its.domain.SaleItem;
import com.example.demo.its.domain.SaleItemDto;
import com.example.demo.its.service.SaleItemServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import static com.example.demo.cmm.util.proxy.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/saleItems")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class SaleItemController {

    private final SaleItemServiceImpl service;

    @PostMapping("/register")
    public ResponseEntity<SaleItem> register(@Validated @RequestBody SaleItem saleItem,
            UriComponentsBuilder uriComponentsBuilder) throws Exception {
        println.accept("POST register()");
        println.accept("register saleItemDto.getBoardNo() = " + saleItem.getItemNo());

        return new ResponseEntity<>(saleItem, HttpStatus.OK);
    }
}

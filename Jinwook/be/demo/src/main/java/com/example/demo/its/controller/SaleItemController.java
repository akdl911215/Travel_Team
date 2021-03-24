package com.example.demo.its.controller;

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

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/saleItems")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class SaleItemController {

    private final SaleItemServiceImpl service;

    @PostMapping("/register")
    public ResponseEntity<SaleItemDto> register(@Validated @RequestBody SaleItemDto saleItemDto,
            UriComponentsBuilder uriComponentsBuilder) throws Exception {
        System.out.println("POST register()");
        service.register(saleItemDto);
        System.out.println("register saleItemDto.getBoardNo() = " + saleItemDto.getItemNo());

        return new ResponseEntity<>(saleItemDto, HttpStatus.OK);
    }
}

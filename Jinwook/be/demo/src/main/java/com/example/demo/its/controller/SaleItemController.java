package com.example.demo.its.controller;

import com.example.demo.its.domain.SaleItem;
import com.example.demo.its.domain.SaleItemDto;
import com.example.demo.its.service.SaleItemServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import static com.example.demo.cmm.util.proxy.*;

import java.util.List;

import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/saleItems")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class SaleItemController {

    private final SaleItemServiceImpl service;

    @PostMapping("/register")
    public ResponseEntity<SaleItem> register(@RequestBody SaleItemDto saleItem) throws Exception {
        println.accept("POST register()");
        service.register(saleItem);

        return new ResponseEntity<>(saleItem, HttpStatus.OK);
    }
}

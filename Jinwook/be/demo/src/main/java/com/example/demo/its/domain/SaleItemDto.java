package com.example.demo.its.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class SaleItemDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private long itemNo;
    private String itemPicture;
    private String hashTag;
    private String title;
    private String writer;
    private String content;
    private String price;
    private String regDate;
    private Boolean soldOut;

}

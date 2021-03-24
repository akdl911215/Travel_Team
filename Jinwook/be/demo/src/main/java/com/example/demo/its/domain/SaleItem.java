package com.example.demo.its.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "sale_items")
public class SaleItem {

    @Id
    @GeneratedValue
    @Column(name = "item_no")
    private long itemNo;
    @Column(name = "item_picture")
    private String itemPicture;
    @Column(name = "hash_tag")
    private String hashTag;
    @Column(name = "title")
    private String title;
    @Column(name = "writer")
    private String writer;
    @Column(name = "content")
    private String content;
    @Column(name = "price")
    private String price;
    @Column(name = "reg_date")
    private String regDate;
    @Column(name = "sold_out")
    private Boolean soldOut;

}

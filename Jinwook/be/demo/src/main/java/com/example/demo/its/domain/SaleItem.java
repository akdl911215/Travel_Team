package com.example.demo.its.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "sale_items")
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Builder
    public SaleItem(String itemPicture, String hashTag, String title, String writer, String content, String price,
            String regDate, Boolean soldOut) {
        this.itemPicture = itemPicture;
        this.hashTag = hashTag;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.price = price;
        this.regDate = regDate;
        this.soldOut = soldOut;
    }

}

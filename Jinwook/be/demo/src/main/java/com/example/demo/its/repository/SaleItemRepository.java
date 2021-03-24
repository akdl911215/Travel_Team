package com.example.demo.its.repository;

import java.util.List;

import com.example.demo.its.domain.SaleItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface SaleItemCustomRepository {
    @Query("insert into sale_items(title, writer, hash_tag, item_picture, content, price "
            + "values(title :title AND writer :writer AND hash_tag :hashTag AND item_picture :itemPicture AND content :content AND price :price)")
    public void create(@Param("title") String title, @Param("writer") String writer, @Param("hashTag") String hashTag,
            @Param("itemPicture") String itemPicture, @Param("content") String content, @Param("price") String price);
}

public interface SaleItemRepository extends JpaRepository<SaleItem, Long>, SaleItemCustomRepository {

}

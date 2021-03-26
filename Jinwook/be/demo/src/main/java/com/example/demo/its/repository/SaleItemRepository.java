package com.example.demo.its.repository;

import java.util.List;

import com.example.demo.its.domain.SaleItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

interface SaleItemCustomRepository {
    @Modifying
    @Query(value = "insert into SaleItem (title, writer, hashTag, itemPicture, content, soldOut) values(:title, :writer, :hashTag, :itemPicture, :content, :soldOut)", nativeQuery = true)
    void create(@Param("title") String title, @Param("writer") String writer, @Param("hashTag") String hashTag,
            @Param("itemPicture") String itemPicture, @Param("content") String content,
            @Param("soldOut") String soldOut);

    @Modifying
    @Query("update SaleItem set title = :#{#parmaSale.title},writer = :#{#parmaSale.writer}, hashTag = :#{#parmaSale.hashTag},itemPicture = :#{#parmaSale.itemPicture}, content = :#{#parmaSale.content}, soldOut = :#{#saleItem.soldOut} ")
    void modify(@Param("parmaSale") SaleItem saleItem);

    @Query(value = "SELECT title, writer, hashTag, itemPicture, content, price, regDate FROM SaleItem its WHERE its.itemNo= :itemNo")
    SaleItem read(@Param("itemNo") long itemNo);

    @Modifying
    @Query("delete its FROM SaleItem its WHERE its.itemNo= :itemNo")
    void remove(@Param("itemNo") long itemNo);
}

@Repository
public interface SaleItemRepository extends JpaRepository<SaleItem, Long>, SaleItemCustomRepository {

    public SaleItem findbyHashTag(String hashTag);

    public List<SaleItem> findAllbyItmeNo(Long itemNo);

    @Query(value = "SELECT * FROM SaleItem GROUP BY soldOut", nativeQuery = true)
    public List<SaleItem> groupListBySoldOut(Boolean soldOut);

    void deleteById(Long itemNo);

    public SaleItem save(SaleItem saleItem);
}

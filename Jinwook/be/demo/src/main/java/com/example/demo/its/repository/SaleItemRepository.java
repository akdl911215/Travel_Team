package com.example.demo.its.repository;

import java.util.List;

import com.example.demo.its.domain.SaleItem;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

interface SaleItemCustomRepository {

}

@Repository
public interface SaleItemRepository extends JpaRepository<SaleItem, Long>, SaleItemCustomRepository {

    @Modifying
    @Query("update SaleItem set title = :#{#parmaSale.title},writer = :#{#parmaSale.writer}, hashTag = :#{#parmaSale.hashTag},itemPicture = :#{#parmaSale.itemPicture}, content = :#{#parmaSale.content}, soldOut = :#{#saleItem.soldOut} ")
    void modify(@Param("parmaSale") SaleItem saleItem);

    @Query(value = "SELECT title, writer, hashTag, itemPicture, content, price, regDate FROM SaleItem its WHERE its.itemNo= :itemNo")
    SaleItem read(@Param("itemNo") long itemNo);

    @Query(value = "SELECT its FROM SaleItem its WHERE its.itemNo > 0 ORDER BY its.itemNo desc, its.regDate desc")
    List<SaleItem> list();

    @Modifying
    @Query("delete its FROM SaleItem its WHERE its.itemNo= :itemNo")
    void remove(@Param("itemNo") long itemNo);
}

package com.example.demo.its.repository;

import java.util.List;

import com.example.demo.its.domain.SaleItemDto;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SaleItemRepositoryImpl implements SaleItemRepository {
    private final JdbcTemplate jdbcTemplate;

    public void create(SaleItemDto saleItemDto) throws Exception {
        System.out.println("create()");

        String query = "insert into sale_items(item_picture, hash_tag, title, writer, content, price) "
                + "values(?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, saleItemDto.getItemPicture(), saleItemDto.getHashTag(), saleItemDto.getTitle(),
                saleItemDto.getWriter(), saleItemDto.getContent(), saleItemDto.getPrice());
    }

    public SaleItemDto read(Long itemNo) {
        return null;
    }

    public List<SaleItemDto> list() {
        return null;
    }

    public SaleItemDto delete(Long itemNo) {
        return null;
    }

    public void modify(SaleItemDto saleItemDto) {
    }

}

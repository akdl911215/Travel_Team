package com.example.demo.its.service;

import java.util.List;

import com.example.demo.its.domain.SaleItemDto;

public interface SaleItemService {

    public void register(SaleItemDto saleItemDto) throws Exception;

    public SaleItemDto read(Long itemNo) throws Exception;

    public void modify(SaleItemDto saleItemDto) throws Exception;

    public SaleItemDto delete(Long itemNo) throws Exception;

    public List<SaleItemDto> list() throws Exception;

}

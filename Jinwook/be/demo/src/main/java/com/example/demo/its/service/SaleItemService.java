package com.example.demo.its.service;

import java.util.List;

import com.example.demo.its.domain.SaleItem;
import com.example.demo.its.domain.SaleItemDto;
import com.example.demo.its.repository.SaleItemRepository;

public interface SaleItemService {
    public void register(SaleItem saleItem) throws Exception;

    public SaleItem read(Long itemNo) throws Exception;

    public void modify(SaleItem saleItem) throws Exception;

    public void remove(Long itemNo) throws Exception;

    public List<SaleItem> list() throws Exception;
}

package com.example.demo.its.service;

import java.util.List;

import com.example.demo.its.domain.SaleItemDto;
import com.example.demo.its.repository.SaleItemRepositoryImpl;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleItemServiceImpl implements SaleItemService {

    private final SaleItemRepositoryImpl repo;

    @Override
    public void register(SaleItemDto saleItemDto) throws Exception {
        repo.create(saleItemDto);

    }

    @Override
    public SaleItemDto read(Long itemNo) throws Exception {
        // TODO Auto-generated method stub
        return repo.read(itemNo);
    }

    @Override
    public void modify(SaleItemDto saleItemDto) throws Exception {
        repo.modify(saleItemDto);

    }

    @Override
    public SaleItemDto delete(Long itemNo) throws Exception {
        // TODO Auto-generated method stub
        return repo.delete(itemNo);
    }

    @Override
    public List<SaleItemDto> list() throws Exception {
        // TODO Auto-generated method stub
        return repo.list();
    }
}

package com.example.demo.its.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.its.domain.SaleItem;
import com.example.demo.its.domain.SaleItemDto;
import com.example.demo.its.domain.SaleItem;
import com.example.demo.its.repository.SaleItemRepository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleItemServiceImpl /* extends AbstractService<SaleItemDto> */ implements SaleItemService {

    private final SaleItemRepository repo;

    @Override
    public void register(SaleItem saleItem) throws Exception {
        // TODO Auto-generated method stub
        repo.save(saleItem);

    }

    @Override
    public SaleItem read(Long itemNo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void modify(SaleItem saleItem) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Long itemNo) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public List<SaleItem> list() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}

package com.example.demo.its.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.its.domain.SaleItem;
import com.example.demo.its.domain.SaleItem;
import com.example.demo.its.repository.SaleItemRepository;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleItemServiceImpl extends AbstractService<SaleItem> implements SaleItemService {

    private final SaleItemRepository repo;

    @Override
    public Optional<SaleItem> findOne(Example<SaleItem> example) {
        // TODO Auto-generated method stub
        return repo.findOne(example);
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return repo.count();
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        repo.deleteById(id);

    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return repo.existsById(id);
    }

    @Override
    public Optional<SaleItem> findById(long id) {
        // TODO Auto-generated method stub
        return repo.findById(id);
    }

    @Override
    public List<SaleItem> findAll() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    @Override
    public List<SaleItem> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return repo.findAllById(ids);
    }

    @Override
    public SaleItem save(SaleItem entity) {
        // TODO Auto-generated method stub
        return repo.save(entity);
    }

    @Override
    public SaleItem getOne(long id) {
        // TODO Auto-generated method stub
        return repo.getOne(id);
    }

}

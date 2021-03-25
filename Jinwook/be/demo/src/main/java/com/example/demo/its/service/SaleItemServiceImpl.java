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
public class SaleItemServiceImpl extends AbstractService<SaleItemDto> implements SaleItemService {

    private final SaleItemRepository repo;

    @Override
    public List<SaleItem> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<SaleItem> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<SaleItem> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends SaleItem> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    public <S extends SaleItem> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SaleItem> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub

    }

    @Override
    public SaleItem getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends SaleItem> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends SaleItem> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<SaleItem> findAll(org.springframework.data.domain.Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<SaleItem> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(SaleItem entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends SaleItem> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public <S extends SaleItem> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends SaleItem> Page<S> findAll(Example<S> example, org.springframework.data.domain.Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends SaleItem> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends SaleItem> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void modify(SaleItem saleItem) {
        // TODO Auto-generated method stub

    }

    @Override
    public SaleItem read(long itemNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<SaleItem> list() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove(long itemNo) {
        // TODO Auto-generated method stub

    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<SaleItemDto> findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SaleItemDto getOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends SaleItem> S save(S entity) {
        // TODO Auto-generated method stub
        return repo.save(entity);
    }

}

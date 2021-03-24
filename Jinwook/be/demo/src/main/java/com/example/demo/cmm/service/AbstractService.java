package com.example.demo.cmm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

public abstract class AbstractService<T> {

    public abstract Optional<T> findOne(Example<T> example);

    public abstract long count();

    public abstract void deleteById(long id);

    public abstract boolean existsById(long id);

    public abstract Optional<T> findById(long id);

    public abstract List<T> findAll();

    public abstract List<T> findAllById(Iterable<Long> ids);

    public abstract T save(T entity);

    public abstract T getOne(long id);

}

package com.example.demo.fds.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.fds.domain.Feeds;
import com.example.demo.fds.repository.FeedsBoardRepository;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Service
public class FeedsBoardServiceImpl extends AbstractService<Feeds> implements FeedsBoardService {

    private final FeedsBoardRepository fBoardRepo;

    @Override
    public long count() {
        return fBoardRepo.count();
    }

    @Override
    public boolean existsById(long id) {
        return fBoardRepo.existsById(id);
    }

    // return null
    @Override
    public List<Feeds> findAll() {
        return null;
    }

    // return null
    @Override
    public Optional<Feeds> findOne() {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Feeds getOne(long id) {
        return fBoardRepo.getOne(id);
    }

    @Override
    public Feeds save(Feeds entity) {
        return fBoardRepo.save(entity);
    }

}

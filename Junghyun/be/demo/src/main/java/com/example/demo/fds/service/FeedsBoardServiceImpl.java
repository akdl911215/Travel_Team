package com.example.demo.fds.service;

import com.example.demo.fds.repository.FeedsBoardRepository;

import org.springframework.stereotype.Service;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Service
public class FeedsBoardServiceImpl implements FeedsBoardService {

    private final FeedsBoardRepository fBoardRepo;

    @Override
    public List<FeedsDto> list() throws Exception {
        return fBoardRepo.list();
    }

    @Override
    public void modify(FeedsDto board) throws Exception {
        fBoardRepo.update(board);
    }

    @Override
    public FeedsBoard read(Long boardNo) throws Exception {
        return fBoardRepo.read(boardNo);
    }

    @Override
    public void register(FeedsDto board) throws Exception {
        fBoardRepo.create(board);
    }

    @Override
    public void remove(Long boardNo) throws Exception {
        fBoardRepo.delete(boardNo);
    }

}

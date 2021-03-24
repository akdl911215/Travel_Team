package com.example.demo.fds.service;

import com.example.demo.fds.domain.FeedDto;

public interface FeedsBoardService {
    public void register(FeedsDto board) throws Exception;
    public FeedsBoard read(Long boardNo) throws Exception;
    public void modify(FeedsDto board) throws Exception;
    public void remove(Long boardNo) throws Exception;
    public List<FeedsDto> list() throws Exception;
}

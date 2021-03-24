package com.example.demo.fds.service;

import java.util.List;

import com.example.demo.fds.domain.Feeds;

public interface FeedsBoardService {
    public void register(Feeds feed) throws Exception;
    public Feeds read(Long feed) throws Exception;
    public void modify(Feeds feed) throws Exception;
    public void remove(Long feedsNo) throws Exception;
    public List<Feeds> list() throws Exception;
}

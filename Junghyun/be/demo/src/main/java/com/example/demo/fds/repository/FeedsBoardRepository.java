package com.example.demo.fds.repository;

import java.util.List;

import com.example.demo.fds.domain.Feeds;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

interface FeedsCustomRepository {
   
}

@Repository
public interface FeedsBoardRepository extends CrudRepository<Feeds, Long>,
                                              FeedsCustomRepository {

   
}  
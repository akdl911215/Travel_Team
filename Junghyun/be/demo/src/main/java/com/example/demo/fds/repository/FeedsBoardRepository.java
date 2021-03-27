package com.example.demo.fds.repository;

import java.util.List;

import com.example.demo.fds.domain.Feeds;
import com.example.demo.fds.domain.FeedsDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FeedsBoardRepository extends JpaRepository<Feeds, Long>{


}  
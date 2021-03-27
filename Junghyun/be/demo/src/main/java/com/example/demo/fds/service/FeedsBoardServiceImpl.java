package com.example.demo.fds.service;

import java.util.List;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.fds.domain.Feeds;
import com.example.demo.fds.repository.FeedsBoardRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@AllArgsConstructor
@Service
public class FeedsBoardServiceImpl extends AbstractService<Feeds> implements FeedsBoardService {

    private final FeedsBoardRepository repo;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Feeds getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feeds save(Feeds entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}


}

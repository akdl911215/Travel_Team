package com.example.demo.fds.service;

import java.util.List;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.fds.domain.Feeds;
import com.example.demo.fds.repository.FeedsBoardRepository;

import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Service
public class FeedsBoardServiceImpl extends AbstractService<Feeds> implements FeedsBoardService {

    private final FeedsBoardRepository fBoardRepo;

	@Override
	public void register(Feeds feed) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Feeds read(Long feed) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Feeds feed) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Long feedsNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Feeds> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

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
		return null;
	}


}

package com.example.nayami.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nayami.dao.ContentsDao;
import com.example.nayami.entity.Contents;

@Service
public class ContentsServiceImpl implements ContentsService {

	private final ContentsDao dao;
	
	@Autowired ContentsServiceImpl(ContentsDao dao){
		this.dao = dao;
	}

	@Override
	public void create(Contents contents) {
		dao.insertContents(contents);
	}

	@Override
	public List<Contents> getAll() {
		return dao.getAll();
	}

	@Override
	public Contents getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void update(Contents contents) {
		dao.updateContents(contents);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public int getCount() {
		return dao.getCount();
	}

	@Override
	public int getCountGreedy() {
		return dao.getCountGreedy();
	}

	@Override
	public int getCountAnger() {
		return dao.getCountAnger();
	}

	@Override
	public int getCountDelusion() {
		return dao.getCountDelusion();
	}

}

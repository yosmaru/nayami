package com.example.nayami.service;

import java.util.List;

import com.example.nayami.entity.Contents;

public interface ContentsService {
	void create(Contents contents);
	List<Contents> getAll();
	Contents getById(int id);
	void update(Contents contents);
	void delete(int id);
	int getCount();
	int getCountGreedy();
	int getCountAnger();
	int getCountDelusion();
}

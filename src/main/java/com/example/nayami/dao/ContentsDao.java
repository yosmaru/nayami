package com.example.nayami.dao;

import java.util.List;

import com.example.nayami.entity.Contents;

public interface ContentsDao {
	void insertContents(Contents contents);
	List<Contents> getAll();
	Contents getById(int id);
	void updateContents(Contents contents);
	void delete(int id);
}

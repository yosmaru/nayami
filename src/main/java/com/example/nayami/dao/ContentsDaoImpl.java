package com.example.nayami.dao;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.nayami.entity.Contents;

@Repository
public class ContentsDaoImpl implements ContentsDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public ContentsDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertContents(Contents contents) {
		jdbcTemplate.update("INSERT INTO contents(content, category, desire, created) VALUES(?, ?, ?, ?)", contents.getContent(), contents.getCategory(), contents.getDesire(), LocalDateTime.now());
	}

	@Override
	public List<Contents> getAll() {
		String sql = "SELECT id, content, category, desire, created FROM contents";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<Contents> list = new ArrayList<>();
		for (Map<String, Object> result : resultList) {
			Contents contents = new Contents();
			contents.setId((int)result.get("id"));
			contents.setContent((String)result.get("content"));
			contents.setCategory((String)result.get("category"));
			contents.setDesire((String)result.get("desire"));
			contents.setCreated((Timestamp)result.get("created"));
			list.add(contents);
		}
		return list;
	}

	@Override
	public Contents getById(int id) {
		String sql = "SELECT id, content, category, desire, created FROM contents WHERE id=" + id;
		Map<String, Object> result = jdbcTemplate.queryForMap(sql);
		Contents contents = new Contents();
		contents.setId((int)result.get("id"));
		contents.setContent((String)result.get("content"));
		contents.setCategory((String)result.get("category"));
		contents.setDesire((String)result.get("desire"));
		contents.setCreated((Timestamp)result.get("created"));
		return contents;
	}

	@Override
	public void updateContents(Contents contents) {
		String sql = "UPDATE contents "
				+ "SET content = ?, category = ?, desire = ? WHERE id = ?";

		jdbcTemplate.update(sql, contents.getContent(),
				contents.getCategory(), contents.getDesire(), contents.getId());
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM contents "
				+ "WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public int getCount() {
		String sql = "SELECT COUNT(*) FROM contents";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
}

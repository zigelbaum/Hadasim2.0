package com.zigelbaum.pm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zigelbaum.pm.api.Positive;
import com.zigelbaum.pm.rowmapper.PositiveRowMapper;

@Repository
public class PositiveDAOImpl implements PositiveDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Positive> loadPositives() {
		
		String sql = "SELECT * FROM positives";
		List<Positive> positivesList = jdbcTemplate.query(sql, new PositiveRowMapper());
		return positivesList;
	}

}

package com.zigelbaum.pm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import org.springframework.jdbc.core.RowMapper;

import com.zigelbaum.pm.api.Positive;

public class PositiveRowMapper implements RowMapper<Positive> {

	@Override
	public Positive mapRow(ResultSet rs, int rowNum) throws SQLException {

		Positive positive = new Positive();

		positive.setId(rs.getInt("id"));
		positive.setDate_of_pos(rs.getDate("date_of_pos"));
		Date date_of_rec = rs.getDate("date_of_rec");
		if (date_of_rec != null)
			positive.setDate_of_rec(date_of_rec);

		return positive;

	}
}

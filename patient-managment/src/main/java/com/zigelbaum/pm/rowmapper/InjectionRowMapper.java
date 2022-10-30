package com.zigelbaum.pm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zigelbaum.pm.api.Injection;

public class InjectionRowMapper implements RowMapper<Injection> {
	
	@Override
	public Injection mapRow(ResultSet rs, int rowNum) throws SQLException {

		Injection injection = new Injection();

		injection.setId(rs.getInt("id"));
		injection.setDate(rs.getDate("date"));
		injection.setCompany(rs.getString("company"));
		
		System.out.println(injection);
		return injection;
	}

}

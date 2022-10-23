package com.zigelbaum.pm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zigelbaum.pm.api.Patient;

public class PatientRowMapper implements RowMapper<Patient> {

	// a method that takes the values of a row and assign them to the properties of
	// patient object
	@Override
	public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {

		Patient patient = new Patient();

		patient.setId(rs.getInt("id"));
		patient.setLast_name(rs.getString("last_name"));
		patient.setFirst_name(rs.getString("first_name"));
		patient.setAddress(rs.getString("address"));
		patient.setDate_of_birth(rs.getDate("date_of_birth"));
		Long tel_num = rs.getLong("tel_num");
		if (tel_num != null)
			patient.setTel_num(tel_num);
		Long cell_num = rs.getLong("cell_num");
		if (cell_num != null)
			patient.setCell_num(cell_num);

		return patient;
	}

}

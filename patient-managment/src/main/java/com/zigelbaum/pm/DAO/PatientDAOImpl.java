package com.zigelbaum.pm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zigelbaum.pm.api.Patient;
import com.zigelbaum.pm.rowmapper.PatientRowMapper;

@Repository
public class PatientDAOImpl implements PatientDAO {

	// using JdbcTemplate so i would be able to run the query later
	// and able to communicate with the database
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Patient> loadPatients() {

		// getting patients data from database with sql query

		String sql = "SELECT * FROM patients";
		// the rowmapper will be executed as the number of thr rows in the patients
		// table
		List<Patient> patientsList = jdbcTemplate.query(sql, new PatientRowMapper());

		return patientsList;
	}

	@Override
	public void savePatient(Patient patient) {

		// storing the object to db

		Object[] sqlParamsObjects = { patient.getId(), patient.getLast_name(), patient.getFirst_name(),
				patient.getAddress(), patient.getDate_of_birth(), patient.getTel_num(), patient.getCell_num() };

		String sql = "insert into patients(id, last_name, first_name, address, date_of_birth, tel_num, cell_num) values(?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParamsObjects);

		System.out.println("record inserted");
	}

	@Override
	public Patient loadPatient(int id) {
		
		String sql = "select * from patients where id = ?";
		Patient patient = jdbcTemplate.queryForObject(sql, new PatientRowMapper(), id);
		return patient;
	}

	@Override
	public void update(Patient patient) {

		String sql = "UPDATE patients SET last_name=?, first_name=?, address=?, tel_num=?, cell_num=? WHERE id = ?";
		jdbcTemplate.update(sql, patient.getLast_name(),patient.getFirst_name(),patient.getAddress(),patient.getTel_num(),
										patient.getCell_num(),patient.getId());
		System.out.println("patient has been updated");
		
	}

	@Override
	public void deletePatient(Integer id) {
		
		String sql = "DELETE FROM patients WHERE id = ?";
		jdbcTemplate.update(sql, id);
		
	}

}

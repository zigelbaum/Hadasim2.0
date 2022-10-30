package com.zigelbaum.pm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zigelbaum.pm.api.Injection;
import com.zigelbaum.pm.api.Patient;
import com.zigelbaum.pm.rowmapper.InjectionRowMapper;
import com.zigelbaum.pm.rowmapper.PatientRowMapper;

@Repository
public class InjectionDAOImpl implements InjectionDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Injection> loadInjections() {
		
		System.out.println("in dao");
		String sql = "SELECT * FROM injections";
		// the rowmapper will be executed as the number of thr rows in the patients
		// table	
		List<Injection> injectionList = jdbcTemplate.query(sql, new InjectionRowMapper());

		System.out.println(injectionList);
		return injectionList;
	}

	@Override
	public Injection loadInjection(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveInjection(Injection injection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInjection(Injection injection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInjection(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Injection> loadPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	


}

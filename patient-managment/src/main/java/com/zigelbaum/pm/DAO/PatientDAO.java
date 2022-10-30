package com.zigelbaum.pm.DAO;

import java.util.List;

import com.zigelbaum.pm.api.Patient;

public interface PatientDAO {
	
	List<Patient>loadPatients();
	
	Patient loadPatient(int id);
	
	void savePatient(Patient patient);

	void update(Patient patient);

	void deletePatient(Integer id);

}

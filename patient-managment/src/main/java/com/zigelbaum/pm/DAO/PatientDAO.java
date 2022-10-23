package com.zigelbaum.pm.DAO;

import java.util.List;

import com.zigelbaum.pm.api.Patient;

public interface PatientDAO {
	
	List<Patient>loadPatients();
	
	void savePatient(Patient patient);

}

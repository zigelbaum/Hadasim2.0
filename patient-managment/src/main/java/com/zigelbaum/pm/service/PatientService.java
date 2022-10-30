package com.zigelbaum.pm.service;

import java.util.ArrayList;
import java.util.List;

import com.zigelbaum.pm.api.Injection;
import com.zigelbaum.pm.api.Patient;

public interface PatientService {
	
	List<Patient>loadPatients();
	
	Patient loadPatient(int id);

	void savePatient(Patient patient);

	void updatePatient(Patient patient);

	void deletePatient(Integer id);

}

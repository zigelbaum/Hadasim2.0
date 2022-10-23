package com.zigelbaum.pm.service;

import java.util.List;

import com.zigelbaum.pm.api.Patient;

public interface PatientService {
	
	List<Patient>loadPatients();

	void savePatient(Patient patient);

}
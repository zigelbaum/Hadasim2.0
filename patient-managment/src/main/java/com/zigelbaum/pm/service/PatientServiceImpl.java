package com.zigelbaum.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zigelbaum.pm.DAO.PatientDAO;
import com.zigelbaum.pm.api.Patient;


@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientDAO;
	
	@Override
	public List<Patient> loadPatients() {

		List<Patient> patientList = patientDAO.loadPatients();		
		return patientList;
	}

	@Override
	public void savePatient(Patient patient) {
		
		//TODO make security tests
		
		patientDAO.savePatient(patient);
		
	}

	@Override
	public Patient loadPatient(int id) {
	
		return patientDAO.loadPatient(id);
	}

	@Override
	public void updatePatient(Patient patient) {

		patientDAO.update(patient);
		
	}

	@Override
	public void deletePatient(Integer id) {
		patientDAO.deletePatient(id);
	}

}

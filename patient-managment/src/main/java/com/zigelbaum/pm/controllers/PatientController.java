package com.zigelbaum.pm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zigelbaum.pm.DAO.PatientDAO;
import com.zigelbaum.pm.api.Patient;
import com.zigelbaum.pm.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	// method that return the patient-list.jsp page - presentation layer
	@GetMapping("/showPatient")
	public String showPatientsList(Model model) {

		// call the service method to get the data
		List<Patient> patientList = patientService.loadPatients();

		model.addAttribute("patients", patientList);

		return "patients-list";
	}

	// method that return the add-student.jsp page - presentation layer
	@GetMapping("/showAddPatient")
	public String addPatients(Model model) {

		Patient patient = new Patient();

		model.addAttribute("patient", patient);

		return "add-patient";
	}
	

	@PostMapping("/save-patient")
	public String savePatient(Patient patient) {
		
		//saving the data to db with Service		
		patientService.savePatient(patient);
		
		return "redirect:/showPatient";
	}
	
	
	// method that return the add-student.jsp page - presentation layer but for update (with information of the user)
		@GetMapping("/showUpdatePatient")
		public String updatePatients(@RequestParam("patientId") Integer id,Model model) {
			
			System.out.println("looking date for the student id: " + id);
			//getting data from db
			Patient user = patientService.loadPatient(id);
			System.out.println(user);
			model.addAttribute("patient",user);
			//sending data to view
			return "add-patient";
		}
	
	
}

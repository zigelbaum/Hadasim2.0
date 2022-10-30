package com.zigelbaum.pm.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zigelbaum.pm.api.Injection;
import com.zigelbaum.pm.api.Patient;
import com.zigelbaum.pm.api.Positive;
import com.zigelbaum.pm.service.InjectionService;
import com.zigelbaum.pm.service.InjectionServiceImpl;
import com.zigelbaum.pm.service.PatientService;
import com.zigelbaum.pm.service.PositiveService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	@Autowired
	private InjectionService injectionService;

	@Autowired
	private PositiveService positiveService;

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

		// saving the data to db with Service
		patientService.savePatient(patient);

		return "redirect:/showPatient";
	}

	// method that return the add-student.jsp page - presentation layer but for
	// update (with information of the user)
	@GetMapping("/showUpdatePatient")
	public String updatePatients(@RequestParam("patientId") Integer id, Model model) {

		System.out.println("looking date for the student id: " + id);
		// getting data from db
		Patient user = patientService.loadPatient(id);
		// System.out.println(user);
		model.addAttribute("patient", user);
		// sending data to view
		return "update-patient";
	}

	@PostMapping("/update-patient")
	public String insertUpdatePatient(Patient patient) {

		// saving the data to db with Service
		patientService.updatePatient(patient);

		return "redirect:/showPatient";
	}

	// method to to show delete page
	@GetMapping("/showDeletePatient")
	public String deletePatient(@RequestParam("patientId") Integer id) {

		System.out.println("looking data of the student id: " + id);

		// deleting data from db
		patientService.deletePatient(id);

		return "redirect:/showPatient";
	}

	// method that return the patient-list.jsp page - presentation layer
	@GetMapping("/showInjection")
	public String showInjectionList(Model model) {

		// call the service method to get the data
		List<Injection> injectionList = injectionService.loadInjections();

		model.addAttribute("injections", injectionList);

		return "injection-list";
	}	
	
	
	// method that return the add-injection.jsp page - presentation layer
		@GetMapping("/showAddInjection")
		public String addInjections(Model model) {

			Injection injection = new Injection();

			model.addAttribute("injection", injection);

			return "add-injection";
		}
		
				
		@PostMapping("/save-injection")
		public String saveInjection(Injection injection) {

			// saving the data to db with Service
			injectionService.saveInjection(injection);

			return "redirect:/showInjection";
		}
		
		
		// method that return the add-student.jsp page - presentation layer but for
		// update (with information of the user)
		@GetMapping("/showUpdateInjection")
		public String updateInjection(@RequestParam("injectionId") Integer id, @RequestParam("injectDate") Date date, Model model) {

			System.out.println("looking date for the injection of id: " + id + " from: " + date);
			// getting data from db
			Injection userInjection = injectionService.loadInjection(id, date);
			// System.out.println(user);
			model.addAttribute("injection", userInjection);
			// sending data to view
			return "update-injection";
		}
		
		
		
		
		// method that return the patient-list.jsp page - presentation layer
		@GetMapping("/showPositives")
		public String showPositivesList(Model model) {

			// call the service method to get the data
			List<Positive> positivesList = positiveService.loadPositives();

			model.addAttribute("positives", positivesList);

			return "positives-list";
		}
}

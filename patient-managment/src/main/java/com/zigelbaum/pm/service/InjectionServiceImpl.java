package com.zigelbaum.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zigelbaum.pm.DAO.InjectionDAO;
import com.zigelbaum.pm.DAO.InjectionDAOImpl;
import com.zigelbaum.pm.api.Injection;
import com.zigelbaum.pm.api.Patient;

@Service
public class InjectionServiceImpl implements InjectionService {
	
	@Autowired
	private InjectionDAO injectionDAO;

	@Override
	public List<Injection> loadInjections() {
		
		List<Injection> injectionList = injectionDAO.loadInjections();		
		return injectionList;
	}

	
	@Override
	public void saveInjection(Injection injection) {
		
		injectionDAO.saveInjection(injection);
		
	}

}

package com.zigelbaum.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zigelbaum.pm.DAO.PositiveDAO;
import com.zigelbaum.pm.api.Positive;
import com.zigelbaum.pm.service.PositiveService;;

@Service
public class PositiveServiceImpl implements PositiveService {
	
	@Autowired
	private PositiveDAO positiveDAO;

	@Override
	public List<Positive> loadPositives() {
		
		return positiveDAO.loadPositives();
		
	}

}

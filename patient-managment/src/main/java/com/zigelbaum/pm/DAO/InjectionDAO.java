package com.zigelbaum.pm.DAO;

import java.util.List;

import com.zigelbaum.pm.api.Injection;

public interface InjectionDAO {
	
    List<Injection>loadInjections();
	
    Injection loadInjection(int id);
	
	void saveInjection(Injection injection);

	void updateInjection(Injection injection);

	void deleteInjection(Integer id);

	List<Injection> loadPatients();

}

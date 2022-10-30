package com.zigelbaum.pm.DAO;

import java.util.Date;
import java.util.List;

import com.zigelbaum.pm.api.Injection;

public interface InjectionDAO {
	
    List<Injection>loadInjections();
	
    Injection loadInjection(int id);
	
	void saveInjection(Injection injection);

	void update(Injection injection);

	void deleteInjection(Integer id);

	Injection loadInjection(Integer id, Date date);

	Injection loadInjections(Integer id);

}

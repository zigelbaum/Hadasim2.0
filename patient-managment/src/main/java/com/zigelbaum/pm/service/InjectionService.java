package com.zigelbaum.pm.service;

import java.util.Date;
import java.util.List;

import com.zigelbaum.pm.api.Injection;

public interface InjectionService {

	List<Injection> loadInjections();

	void saveInjection(Injection injection);

	Injection loadInjection(Integer id, Date date);

}

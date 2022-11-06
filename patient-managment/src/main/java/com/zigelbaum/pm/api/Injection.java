package com.zigelbaum.pm.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class Injection {
	
	private Integer id;
	private Date date;
	private String company;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		
		String dateString = new SimpleDateFormat("yyyy-MM-dd").format(date);
		return "Injection [id=" + id + ", date=" + dateString + ", company=" + company + "]";
	}

}

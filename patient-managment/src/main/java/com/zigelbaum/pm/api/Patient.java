package com.zigelbaum.pm.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient {

	private Integer id;
	
	private String last_name;
	private String first_name;
	private String address;
	private Date date_of_birth;
	private Long tel_num = null;
	private Long cell_num = null;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Long getTel_num() {
		return tel_num;
	}
	public void setTel_num(Long tel_num) {
		this.tel_num = tel_num;
	}
	public Long getCell_num() {
		return cell_num;
	}
	public void setCell_num(Long cell_num) {
		this.cell_num = cell_num;
	}




	
	@Override
	public String toString() {
		
		String dateString = new SimpleDateFormat("yyyy-MM-dd").format(date_of_birth);

		
		return "Patient [id=" + id + ", last_name=" + last_name + ", first_name=" + first_name + ", address=" + address
				+ ", date_of_birth=" + dateString + ", tel_num=" + tel_num + ", cell_num=" + cell_num + "]";
	}  

	
}

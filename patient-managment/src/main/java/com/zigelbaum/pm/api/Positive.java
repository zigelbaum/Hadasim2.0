package com.zigelbaum.pm.api;

import java.text.SimpleDateFormat;
import java.sql.Date;

public class Positive {
	
	private int id;
	private Date date_of_pos;
	private Date date_of_rec;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_of_pos() {
		return date_of_pos;
	}
	public void setDate_of_pos(Date date_of_pos) {
		this.date_of_pos = date_of_pos;
	}
	public Date getDate_of_rec() {
		return date_of_rec;
	}
	public void setDate_of_rec(Date date_of_rec) {
		this.date_of_rec = date_of_rec;
	}
	
	

	@Override
	public String toString() {
		String date_pos = new SimpleDateFormat("yyyy-MM-dd").format(date_of_pos);
		String date_rec = new SimpleDateFormat("yyyy-MM-dd").format(date_of_rec);
		return "Positive [id=" + id + ", date_of_pos=" + date_pos + ", date_of_rec=" + date_rec + "]";
	}
}

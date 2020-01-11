package com.example.funtaipei.travel;

import java.util.Date;

public class TravelDetail {
	
	private int travel_id;

	private int pc_id;

	private String pc_name;

	public TravelDetail(int travel_id, int pc_id, String pc_name) {
		super();
		this.travel_id = travel_id;
		this.pc_id = pc_id;
		this.pc_name = pc_name;
	}
	public int getTravel_id() {
		return travel_id;
	}
	public void setTravel_id(int travel_id) {
		this.travel_id = travel_id;
	}
	public int getPc_id() {
		return pc_id;
	}
	public void setPc_id(int pc_id) {
		this.pc_id = pc_id;
	}
	public String getPc_name() {
		return pc_name;
	}
	public void setPc_name(String pc_name) {
		this.pc_name = pc_name;
	}
	

	
	

}

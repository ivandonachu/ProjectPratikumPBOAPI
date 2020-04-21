package com.example.projectpratikum.model.holiday;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class HolidayDiscoveryResponse{

	@SerializedName("envelope")
	private Envelope envelope;

	@SerializedName("holidays")
	private ArrayList<HolidaysDiscoveryResultItem> holidays;

	@SerializedName("availableFilters")
	private AvailableFilters availableFilters;

	@SerializedName("requests")
	private Requests requests;

	@SerializedName("message")
	private String message;

	@SerializedName("errors")
	private Object errors;

	@SerializedName("status")
	private int status;

	public void setEnvelope(Envelope envelope){
		this.envelope = envelope;
	}

	public Envelope getEnvelope(){
		return envelope;
	}

	public void setHolidays(ArrayList<HolidaysDiscoveryResultItem> holidays){
		this.holidays = holidays;
	}

	public ArrayList<HolidaysDiscoveryResultItem> getHolidays(){
		return holidays;
	}

	public void setAvailableFilters(AvailableFilters availableFilters){
		this.availableFilters = availableFilters;
	}

	public AvailableFilters getAvailableFilters(){
		return availableFilters;
	}

	public void setRequests(Requests requests){
		this.requests = requests;
	}

	public Requests getRequests(){
		return requests;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setErrors(Object errors){
		this.errors = errors;
	}

	public Object getErrors(){
		return errors;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"HolidayDiscoveryResponse{" + 
			"envelope = '" + envelope + '\'' + 
			",holidays = '" + holidays + '\'' + 
			",availableFilters = '" + availableFilters + '\'' + 
			",requests = '" + requests + '\'' + 
			",message = '" + message + '\'' + 
			",errors = '" + errors + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
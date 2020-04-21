package com.example.projectpratikum.model.holiday;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Holidays{

	@SerializedName("holidays")
	private ArrayList<HolidaysDiscoveryResultItem> holidays;

	@SerializedName("query")
	private Query query;

	public void setHolidays(ArrayList<HolidaysDiscoveryResultItem> holidays){
		this.holidays = holidays;
	}

	public ArrayList<HolidaysDiscoveryResultItem> getHolidays(){
		return holidays;
	}

	public void setQuery(Query query){
		this.query = query;
	}

	public Query getQuery(){
		return query;
	}

	@Override
 	public String toString(){
		return 
			"Holidays{" + 
			"holidays = '" + holidays + '\'' + 
			",query = '" + query + '\'' + 
			"}";
		}
}
package com.aman.covidtrackerapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Country.TABLE_NAME)
public class Country {

	public static final String TABLE_NAME = "countries";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="country_id", nullable=false)
	private int id;
	
	@Column(name="country_name", nullable=false)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}
	
	
}

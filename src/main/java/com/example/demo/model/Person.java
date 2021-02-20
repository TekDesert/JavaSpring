package com.example.demo.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity // This tells Hibernate to make a table out of this class
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Generate id automatically
	private int id;
	
	@NotBlank
	private String name;
	
	public Person() {
		
	}
	
	public Person(@JsonProperty("id") int id, 
			@JsonProperty("name") String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	
}

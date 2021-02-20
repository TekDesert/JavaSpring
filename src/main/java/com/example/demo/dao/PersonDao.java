package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {
	
	
	List<Person> findByName(String name);
	
}

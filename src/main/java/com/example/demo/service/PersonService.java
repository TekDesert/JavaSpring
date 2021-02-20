package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;


@Service
public class PersonService {
	
	private final PersonDao personDao;
	
	@Autowired
	public PersonService(PersonDao personDao) {
		this.personDao = personDao; 
	}
	
	public Person addPerson(Person person) {
		return personDao.save(person);
	}
	
	public List<Person> getAllPeople(){
		return personDao.findAll();
	}
	
	public Optional<Person> getPersonById(int id){
		return personDao.findById(id);
	}
	
	public void deletePerson(int id) {
		
		personDao.deleteById(id);
		
	}
	
	public Person updatePerson(Person person) {
		return personDao.save(person);
	}
	
	public List<Person> getPersonByName(String name){
		
		return personDao.findByName(name);
		
	}
	
	
}

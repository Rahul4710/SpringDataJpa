package com.jpa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.example.dao.PeopleManagementDao;
import com.jpa.example.entity.Person;

@Service
public class PeopleManagement {
	@Autowired
	private PeopleManagementDao managementDao;

	public Person createPerson(Person person1) {
		return managementDao.save(person1);
		
	}

	public Iterable<Person> createPerson(List<Person> asList) {
		Iterable<Person> saveAll = managementDao.saveAll(asList);
		return saveAll;
		
	}

	public Iterable<Person> findPeopleById(List<Long> ids) {
		Iterable<Person> iterable = managementDao.findAllById(ids);
		return iterable;
	}
	// sample-api first commit
	public void deletePersonEntity(Person person) {
		managementDao.delete(person);
		
		
	}

	
	} 

	
		




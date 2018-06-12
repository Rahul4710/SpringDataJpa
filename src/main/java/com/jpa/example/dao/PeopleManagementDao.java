package com.jpa.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.example.entity.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Long> {

}

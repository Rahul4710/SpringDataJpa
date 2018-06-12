package com.jpa.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.example.entity.Person;
import com.jpa.example.service.PeopleManagement;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner{
	
	@Autowired
	private PeopleManagement peopleManagement;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createPerson();
		//createPersons();
		//findPeopleById();
		deletePersonEntity();
			
	}
	private void deletePersonEntity() {
		Person person=new Person();
		person.setId(26l);
		peopleManagement.deletePersonEntity(person);
	
		
	}

	private void findPeopleById() {
		List<Long> ids=new ArrayList<>();
		ids.add(25l);
		ids.add(26l);
		ids.add(27l);
		
		Iterable<Person> personList=peopleManagement.findPeopleById(ids);
		personList.forEach(System.out::println);		
	}

	private void createPersons() {
		List<Person> asList = Arrays.asList(new Person("rohan","singh","rohan@gmail.com",new Date()),new Person("prince","singh","prince@gmail.com", new Date()),new Person("deepak", "verma", "deepalver22@gmail.com", new Date()));
		Iterable<Person> createPerson = peopleManagement.createPerson(asList);
		for (Person person : createPerson) {
			System.out.println(person);
			
		}
	}

	private void createPerson() {
		Person person1= new Person("rahul","singh", "singh094rahul@gmail.com", new Date());
		Person personDb=peopleManagement.createPerson(person1);
		System.out.println(personDb);
		
	}
}

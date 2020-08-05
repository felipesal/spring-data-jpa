package com.felipesalles.revjpa.dao;

import java.util.List;

import com.felipesalles.revjpa.entity.Person;

public class PersonDAO extends GenericDAO<Person>{

	public PersonDAO() {
		super(Person.class);
	}

	public List<Person> findByLastName(String lastName){
		String jpql = "from Person p where p.lastname like ?";
		
		return find(jpql, lastName);
	}
	
	

}

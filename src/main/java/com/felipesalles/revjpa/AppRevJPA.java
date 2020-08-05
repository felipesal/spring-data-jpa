package com.felipesalles.revjpa;

import java.util.List;

import com.felipesalles.revjpa.dao.PersonDAO;
import com.felipesalles.revjpa.entity.Document;
import com.felipesalles.revjpa.entity.Person;

/**
 * Hello world!
 *
 */
public class AppRevJPA 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //insertPerson();
        
        //findPersonById();
        
        //findAllPersons();
        
        //countPersons();
        
        //findByLastName();
        
        insertDocument();
    }

	private static void insertDocument() {
		Person p1 = new Person();
		p1.setFirstname("Melissa");
		p1.setLastname("de Souza");
		p1.setAge(24);
		p1.setDocument(new Document("999.999.999-99", 244466666));

		new PersonDAO().save(p1);
		
		System.out.println(p1.toString());
		
	}

	private static void findByLastName() {
		List<Person> p1 = new PersonDAO().findByLastName("Figueira");
		
		for(Person p : p1) {
			System.out.println(p.toString());
		}
		
	}

	private static void countPersons() {
		Long count = new PersonDAO().count();
		
		System.out.println("Total of persons: " + count);
		
	}

	private static void findAllPersons() {
		List<Person> persons = new PersonDAO().findAll();
		
		for(Person p : persons) {
			System.out.println(p.toString());
		}
		
	}

	private static void findPersonById() {
		Person p1 = new PersonDAO().findById(2L);
		
		Person p2 = new PersonDAO().findById(4L);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

	private static void insertPerson() {
		
		Person p1 = new Person();
		p1.setFirstname("Fabiana");
		p1.setLastname("da Silva");
		p1.setAge(29);

		new PersonDAO().save(p1);
		
		System.out.println(p1.toString());
		
		Person p2 = new Person();
		p2.setFirstname("Gilberto");
		p2.setLastname("Figueira");
		p2.setAge(36);
		
		new PersonDAO().save(p2);
		
		System.out.println(p2.toString());
		
		Person p3 = new Person();
		p3.setFirstname("Carlos André");
		p3.setLastname("Rodrigues");
		p3.setAge(28);
		
		new PersonDAO().save(p3);
		
		System.out.println(p3.toString());
	}
    
    
}

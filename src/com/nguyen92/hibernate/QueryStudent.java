package com.nguyen92.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudent {

	public static void main(String[] args) {
		
		/* 
		 * SessionFactory:	- reads the hibernate config file
		 * 					- creates Session objects
		 * 					- Heavy-weight object, write once and use many times
		 * 
		 * Session:	- Wraps a JDBC connection
		 * 			- Main object used to save/retrieve objects from db
		 * 			- short-lived object
		 * 			- Retrieved from SessionFactory
		 * */

		// Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create Session
		Session session = factory.getCurrentSession();
		
		try{			
			// start a transaction			
			session.beginTransaction();
			
			// query Student table
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			System.out.println("\nQuery all the students");
			displayStudents(theStudents);
			
			// query students whose lastName = "Starch"
			// use member variable name lastName, not column name last_name
			List<Student> starchList = session.createQuery("from Student s where s.lastName='Starch'").getResultList();
			System.out.println("\nQuery all students with last name Starch");
			displayStudents(starchList);
			
			// query students whose lastName is "Park" or firstName is "Lowe"
			List<Student> parkOrLowe = session.createQuery("from Student s where s.lastName='Park' OR s.firstName='Lowe'").getResultList();
			System.out.println("\nQuery all students with last name Park or first name Lowe");
			displayStudents(parkOrLowe);
			
			// query students whose last name starts with m
			List<Student> mNames = session.createQuery("from Student s where s.lastName LIKE 'M%'").getResultList();
			System.out.println("\nQuery all students whose last name begins with 'M'");
			displayStudents(mNames);
				
			// commit transaction to db
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student temp : theStudents) {
			System.out.println(temp);
		}
	}

}


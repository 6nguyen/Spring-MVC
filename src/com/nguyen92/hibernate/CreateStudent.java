package com.nguyen92.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

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
			// use the session object to save Java object
			
			
			// create a student object
			
			
			// start a transaction
			
			
			// save the student object
			
			
			// commit transaction to db
			
			
		}
		finally {
			factory.close();
		}
	}

}


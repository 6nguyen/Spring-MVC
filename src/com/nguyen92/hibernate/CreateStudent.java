package com.nguyen92.hibernate;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args) throws ParseException {
		
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
			// create a Date object for each student
			String dob = "12/04/1990";
			Date theDOB = DateUtil.parseDate(dob);
			
			// create a few Student objects
			Student tempStudent1 = new Student("Spruce", "Wayne", "sw@gmail.com", theDOB);
			Student tempStudent2 = new Student("Clerk", "Cant", "cc@gmail.com", theDOB);
			Student tempStudent3 = new Student("Eric", "Magento", "em@gmail.com", theDOB);
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			// commit transaction to db
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}


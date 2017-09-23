/*
 * 			Reading MySQL records using Hibernate
 * 
 */
package com.nguyen92.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudent {

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
			System.out.println("Creating new Student object.");
			Student temp = new Student("Duncan", "Daughnutt", "dd@gmail.com");
			
			// start a transaction			
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student.");
			session.save(temp);			
			
			// commit transaction to db
			session.getTransaction().commit();
			System.out.println("Student committed to MySQL DB");
			
			
		/*************************************************************************
		 ********   READ:  RETRIEVE A USER FROM MySQL DB   ***********************
		 *************************************************************************   
		 *   */
			// find out student's Primary Key: id
			System.out.println("Student's id: " + temp.getId());
			
			// get a new Session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve the student base on primary key id
			System.out.println("Reading student with id: " + temp.getId());
			Student myStudent = session.get(Student.class, temp.getId());
			System.out.println("Student retrieved: " + myStudent);
			
			// commit the transaction
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}


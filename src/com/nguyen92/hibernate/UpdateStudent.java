/*
 * 			Updating MySQL records using Hibernate
 * 
 */

package com.nguyen92.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {

		// Create a Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		

		// create Session object
		Session session = factory.getCurrentSession();
		
		try{
			
			int studentId = 7;
			
			// create session object and begin transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve a student from db using primary key id
			Student myStudent = session.get(Student.class, studentId);
			
			// update student data
			myStudent.setLastName("Reynolds");
			myStudent.setEmail("rr@gmail.com");
			
			// commit transaction to db, no need to save
			session.getTransaction().commit();
			
			
			/* ********************************************************
			 * ***********  Update record directly in db  *************
			 * ******************************************************** */
			
			// start a new session and begin transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// no need to retrieve a student this time, we will do it all with HQL (hibernate query language)
			session.createQuery(  "UPDATE Student "
								+ "SET firstName='Dead', lastName='Pool', email='dp@gmail.com'"
								+ "WHERE id=7").executeUpdate();
			
			// commit transaction
			session.getTransaction().commit();
			
		} finally{
			factory.close();
		}
	}

}

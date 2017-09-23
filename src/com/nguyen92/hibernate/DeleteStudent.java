/*
 * 			Deleting MySQL records using Hibernate
 * 
 */
package com.nguyen92.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

	public static void main(String[] args) {

		// create SessionFactory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create Session object
		Session session = factory.getCurrentSession();
							
		
		try{
			// create new session and begin transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// delete student record directly using HQL
			session.createQuery("DELETE FROM Student WHERE id=7").executeUpdate();
			
			// commit transaction
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}

}

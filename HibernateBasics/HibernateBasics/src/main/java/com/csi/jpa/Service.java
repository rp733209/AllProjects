package com.csi.jpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {

	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {

		saveData();
		getData();
	}

	static void saveData() {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee("VEDANT", 45000);

		session.save(employee);

		transaction.commit();
	}

	static void getData() {

		Session session = factory.openSession();

		session.createQuery("from Employee").list().forEach(System.out::println);

		
	}

}

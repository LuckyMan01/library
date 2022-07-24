package com.example.library;

import model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
//		SessionFactory factory = new Configuration()
//				.addAnnotatedClass(Book.class)
//				.configure("hibernate.cfg.xml")
//				.buildSessionFactory();
//		try {
//
//			Session session = factory.getCurrentSession();
//			session.beginTransaction();
//			session.save("");
//			session.getTransaction().commit();
//		} finally {
//			factory.close();
//		}
	}

}
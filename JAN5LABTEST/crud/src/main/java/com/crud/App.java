package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		System.out.println("CFG is Ready " + cfg);
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("Sf is Ready " + sf);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		// create and insert operation.
//		Crud s1 = new Crud();
//		Crud s2 = new Crud();
//		Crud s3 = new Crud();
//		s1.setS_id(1);
//		s1.setS_name("Pranjal Rajeev");
//		s1.setS_contact("9874563215");
//		s1.setS_address("Patna");
//
//		s2.setS_id(2);
//		s2.setS_name("Raunak Raj");
//		s2.setS_contact("8974562315");
//		s2.setS_address("Ranchi");
//
//		s3.setS_id(3);
//		s3.setS_name("Saurav Kumar");
//		s3.setS_contact("7896541236");
//		s3.setS_address("Bihar");

//		s.save(s1);
//		s.save(s2);
//		s.save(s3);

		// delete operation
//		Crud d1 = new Crud();
//		d1 = s.load(Crud.class, 3);
//		s.delete(d);

		// update operation
//		Crud up = new Crud();
//		up = s.load(Crud.class, 1);
//		up.setS_address("Bihar");
//		s.save(up);

		// read operation
//		Crud read = new Crud();
//		read = s.get(Crud.class, 1);
//		System.out.println(read);

		tr.commit();
	}
}

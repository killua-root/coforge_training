package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;

public class MainClass {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		// INSERT
		Employee emp = new Employee(101, "HAHAHA", 200000, 20);
		session.save(emp);

		// UPDATE
		Employee emp1 = session.get(Employee.class, 101);
		if (emp1 != null) {
			emp1.setEname("Suresh");
			emp1.setEsalary(100000);
			session.update(emp1);
		}

		// SELECT (HQL)
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> list = query.list();

		System.out.println("Employee Details");
		for (Employee e : list) {
			System.out.println(e);
		}

		// DELETE
		Employee emp2 = session.get(Employee.class, 101);
		if (emp2 != null) {
			session.delete(emp2);
		}

		transaction.commit();

		session.close();
		factory.close();

		System.out.println("CRUD Operations Completed");
	}
}
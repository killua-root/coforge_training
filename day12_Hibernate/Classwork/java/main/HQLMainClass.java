package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;

public class HQLMainClass {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Query<Employee> q1 = session.createQuery("from Employee", Employee.class);
		List<Employee> list = q1.list();

		System.out.println("Employee Details:");
		for (Employee e : list) {
			System.out.println(e);
		}

		Query q2 = session.createQuery(
				"update Employee set esalary = :salary where eid = :id");

		q2.setParameter("salary", 300000);
		q2.setParameter("id", 177);

		int updateCount = q2.executeUpdate();
		System.out.println("Rows Updated : " + updateCount);

		Query q3 = session.createQuery(
				"delete from Employee where eid = :id");

		q3.setParameter("id", 177);

		int deleteCount = q3.executeUpdate();
		System.out.println("Rows Deleted : " + deleteCount);

		transaction.commit();

		session.close();
		factory.close();
	}
}
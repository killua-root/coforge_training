package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.entity.Course;
import com.coforge.entity.Student;

public class ManyToMany {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Course c1 = new Course(3010,"Java");
        Course c2 = new Course(3011,"Spring Boot");
        Course c3 = new Course(3012,"Hibernate");

        Student s1 = new Student(101,"John");
        Student s2 = new Student(102,"Priya");

        s1.getCourses().add(c1);
        s1.getCourses().add(c2);

        s2.getCourses().add(c1);
        s2.getCourses().add(c3);

        session.persist(s1);
        session.persist(s2);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Many-to-Many Mapping Successful");
    }
}
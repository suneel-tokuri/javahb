package com.hbexample.pkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.nio.file.*;

public class StoreData {

    public static void main(String[] args) {

        Path p = Paths.get("config", "hibernate.cfg.xml").toAbsolutePath();
        System.out.println("hibernate config: " + p);

        Configuration cfg = new Configuration();
        cfg.configure(p.toFile());

        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setemp_no(123);
        e1.setfirst_name("John");
        e1.setlast_name("Doe");
        e1.setbirth_date("1962-02-05");
        e1.sethire_date("1999-03-23");

        session.persist(e1);

        t.commit();
        session.close();

        System.out.println("Add record done.");
    }
}

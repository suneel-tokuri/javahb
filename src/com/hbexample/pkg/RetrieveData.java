package com.hbexample.pkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;

import java.nio.file.*;
import java.util.*;

public class RetrieveData {

    public static void main(String[] args) {

        Path p = Paths.get("config", "hibernate.cfg.xml").toAbsolutePath();
        System.out.println("hibernate config: " + p);        

        Configuration cfg = new Configuration();
        cfg.configure(p.toFile());

        SessionFactory sfactory = cfg.buildSessionFactory();
        Session session = sfactory.openSession();
       
        //Transaction t = session.beginTransaction();
 
        Query query = session.createQuery("from com.hbexample.pkg.EmployeeTitle where title='Staff'");
        query.setMaxResults(10);
        List l1 = query.list();

        //t.commit();

        System.out.println("list size: " + l1.size());

        for(Object et : l1) {
            System.out.println(et);
        }

        session.close();
        System.out.println("-- end of list --");
    }
}  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shiuly
 */
public class AdminaddoctorDao {
      public void doSave(Adminadddoctor a) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
 public List<Adminadddoctor> showAll() {
        List<Adminadddoctor> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Adminadddoctor");
        all = q.list();
        return all;
    }
     public void doUp(Adminadddoctor a) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }
  public void doDelete(Adminadddoctor a) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(a);
        s.getTransaction().commit();
        s.close();
    }

      public List <Adminadddoctor> search(String category){
        List<Adminadddoctor> list1 =new ArrayList();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Adminadddoctor where category=:a ");
        q.setString("a", category);
        list1 = q.list();
        return list1;
    }
   
}

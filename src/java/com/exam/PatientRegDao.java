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
public class PatientRegDao {
     public void doSave(PatientReg a) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
      public List<PatientReg> showAll() {
        List<PatientReg> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from PatientReg");
        all = q.list();
        return all;
    }
}

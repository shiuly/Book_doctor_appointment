/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shiuly
 */
public class PatientbookDao {
      public void doSave(Patientbook p) {
          try{
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(p);
        s.getTransaction().commit();
        s.close();
    }
          catch(Exception e){
            JOptionPane.showMessageDialog(null, "Id already used. Please Try Another One");
        }
      }
      
      
       public List<Patientbook> showAll() {
        List<Patientbook> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Patientbook");
        all = q.list();
        return all;
    }
}

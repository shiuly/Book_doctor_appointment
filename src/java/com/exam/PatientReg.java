package com.exam;
// Generated Apr 7, 2019 12:05:28 AM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




/**
 * PatientReg generated by hbm2java
 */
@ManagedBean(name="PR")
@SessionScoped
public class PatientReg  implements java.io.Serializable {
 private List<PatientReg> all = new ArrayList<>();
 

     private int id;
     private String password;
     private String name;
     private String address;
     private String mobileNo;
     private String email;
     private String gender;
     private String age;
     private String bookDate;
     private String treatment;
     private String treatmentFor;
     private String feedback;

    public PatientReg() {
    }

	
    public PatientReg(int id) {
        this.id = id;
    }
    public PatientReg(int id, String password, String name, String address, String mobileNo, String email, String gender, String age, String bookDate, String treatment, String treatmentFor, String feedback) {
       this.id = id;
       this.password = password;
       this.name = name;
       this.address = address;
       this.mobileNo = mobileNo;
       this.email = email;
       this.gender = gender;
       this.age = age;
       this.bookDate = bookDate;
       this.treatment = treatment;
       this.treatmentFor = treatmentFor;
       this.feedback = feedback;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }
    
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAge() {
        return this.age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    public String getBookDate() {
        return this.bookDate;
    }
    
    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }
    public String getTreatment() {
        return this.treatment;
    }
    
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    public String getTreatmentFor() {
        return this.treatmentFor;
    }
    
    public void setTreatmentFor(String treatmentFor) {
        this.treatmentFor = treatmentFor;
    }
    public String getFeedback() {
        return this.feedback;
    }
    
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

 public void doInsert() {
      PatientRegDao ad = new PatientRegDao();
        ad.doSave(this);
    }

    public List<PatientReg> getAll() {
        PatientRegDao ad = new PatientRegDao();
        all=ad.showAll();
        return all;
    }

    public void setAll(List<PatientReg> all) {
        this.all = all;
    }

  

}



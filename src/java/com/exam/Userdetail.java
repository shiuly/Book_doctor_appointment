package com.exam;
// Generated Apr 7, 2019 12:05:28 AM by Hibernate Tools 4.3.1



/**
 * Userdetail generated by hbm2java
 */
public class Userdetail  implements java.io.Serializable {


     private int id;
     private String name;
     private String password;
     private String usertype;

    public Userdetail() {
    }

	
    public Userdetail(int id) {
        this.id = id;
    }
    public Userdetail(int id, String name, String password, String usertype) {
       this.id = id;
       this.name = name;
       this.password = password;
       this.usertype = usertype;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }




}



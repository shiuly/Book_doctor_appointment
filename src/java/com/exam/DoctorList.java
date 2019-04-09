/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author USER
 */
@ManagedBean
@SessionScoped
public class DoctorList {
    private int id;
    private String name;
    private String Specilist;
    private String Hname;

    public DoctorList() {
    }

    public DoctorList(int id, String name, String Specilist, String Hname) {
        this.id = id;
        this.name = name;
        this.Specilist = Specilist;
        this.Hname = Hname;
    }

    public String getHname() {
        return Hname;
    }

    public void setHname(String Hname) {
        this.Hname = Hname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecilist() {
        return Specilist;
    }

    public void setSpecilist(String Specilist) {
        this.Specilist = Specilist;
    }
    
}

package com.exam;
// Generated Apr 7, 2019 12:05:28 AM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Adminadddoctor generated by hbm2java
 */
@ManagedBean(name = "admin")
@SessionScoped
public class Adminadddoctor implements java.io.Serializable {

    private List<Adminadddoctor> all = new ArrayList<>();

    List<Adminadddoctor> list1 = new ArrayList();

    public List<Adminadddoctor> getList1() {
        AdminaddoctorDao ad = new AdminaddoctorDao();
        list1 = ad.search(category);

        return list1;
    }

    public void setList1(List<Adminadddoctor> list1) {
        this.list1 = list1;
    }

    private int id;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private String category;
    private String time;

    public Adminadddoctor() {
    }

    public Adminadddoctor(int id) {
        this.id = id;
    }

    public Adminadddoctor(int id, String name, String address, String mobile, String email, String category, String time) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.category = category;
        this.time = time;
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

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Adminadddoctor> getAll() {
        AdminaddoctorDao ad = new AdminaddoctorDao();
        all = ad.showAll();
        return all;
    }

    public void setAll(List<Adminadddoctor> all) {
        this.all = all;
    }

    public void doInsert() {
        AdminaddoctorDao ad = new AdminaddoctorDao();
        ad.doSave(this);
    }

    public void doUp() {
        AdminaddoctorDao ad = new AdminaddoctorDao();
        ad.doUp(this);
    }

    public void dodelete() {
        AdminaddoctorDao ad = new AdminaddoctorDao();
        ad.doDelete(this);
    }
}

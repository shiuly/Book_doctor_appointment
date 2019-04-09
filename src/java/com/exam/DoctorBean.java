/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author USER
 */
@ManagedBean
@SessionScoped
public class DoctorBean {
     private List<DoctorList> list;
    
    public DoctorBean() {
    }

    public List<DoctorList> getList() {
        list=new ArrayList<>();
        list.add(new DoctorList(100,"DR.Sen","Neurologist","Square Hosital"));
         list.add(new DoctorList(101,"DR.Ria","cadiologist","Ibne Sina Hosital"));
          list.add(new DoctorList(102,"DR.Ria","cadiologist","National Hosital"));
           list.add(new DoctorList(103,"DR.Jahid","cadiologist","Dhaka Medical Hosital"));
            list.add(new DoctorList(104,"DR.Shiuly","Medicine","Square Hosital"));
                list.add(new DoctorList(105,"DR.Shiuly","Medicine","Square Hosital"));
                    list.add(new DoctorList(105,"DR.Shiuly","Medicine","Square Hosital"));
        return list;
    }

    public void setList(List<DoctorList> list) {
        this.list = list;
    }
    
}

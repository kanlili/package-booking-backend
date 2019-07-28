package com.oocl.packagebooking.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long billId;
    @Column
    private  String  name;
    @Column
    private  String  phone;
    @Column
    private  String state;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    @Column
    private  int weigh;

//    public Bill(Long billId, String name, String phone, Date time) {
//        this.billId = billId;
//        this.name = name;
//        this.phone = phone;
//        this.time = time;
//    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public Bill(String name, String phone, String state) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



}

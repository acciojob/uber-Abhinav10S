package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Customer")
public class Customer {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int  customerId ;

     private String mobile ;

     private String password  ;

    public int getCustomerId() {
        return customerId;
    }

    @OneToMany(mappedBy = "customer" ,cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList = new ArrayList<>() ;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}
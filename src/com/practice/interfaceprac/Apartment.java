/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practice.interfaceprac;

/**
 *
 * @author hp
 */
public class Apartment implements RealState {
    double rent;
    String tenant;
    
    
    public Apartment(double rent, String tena){
        this.rent = rent;
        this.tenant = tena;
    }

    @Override
    public double getRent() {
        return this.rent;
    }

    @Override
    public String getCurrentTenant() {
        return this.tenant;
    }

    @Override
    public double getUtilityBill() {
        return 0.3 * this.rent;
    }
    
}

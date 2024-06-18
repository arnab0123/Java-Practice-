/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.interfaceprac;

/**
 *
 * @author hp
 */
public class House implements RealState{

    double rent;
    String tenant;
    int years;
    
    
    public House(double rent, String tena, int y){
        this.rent = rent;
        this.tenant = tena;
        this.years = y;
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
        return (0.3 * this.rent) + (10 * this.years);
    }
    
}

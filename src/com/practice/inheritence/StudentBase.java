package com.practice.inheritence;

/**
 *
 * @author hp
 */
public class StudentBase {
    String name;
    String studentID;
    
    public StudentBase(String n, String id){
        this.name = n;
        this.studentID = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getID(){
        return this.studentID;
    }
    
    public void message(){
        System.out.println("Base Class!");
    }
}

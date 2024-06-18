package com.practice.inheritence;

/**
 *
 * @author hp
 */
public class SchoolStudent extends StudentBase{
    String schoolName;
    
    public SchoolStudent(String n, String i, String sName){
        super(n, i);
        this.schoolName = sName;
    }
    
    public String getSchoolName(){
        return this.schoolName;
    }
    
    @Override
    public void message(){
        System.out.println(
            "School Student Class!"
        );
    }
}

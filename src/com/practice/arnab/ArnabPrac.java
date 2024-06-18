package com.practice.arnab;

import java.util.Scanner;
import com.practice.inheritence.*;
import com.practice.interfaceprac.Apartment;
import com.practice.interfaceprac.House;
import com.practice.interfaceprac.RealState;
import com.practice.list.*;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class ArnabPrac {

    static int next(int n){
        return n+1;
    }
    
    static int add(int a, int b){
        return a + b;
    }
    
    static int fibonacci(int n){
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fibonacci(n-1) + fibonacci(n-2);
        };
    }
    
    static int iterFibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] fibSeries = new int[n+1];
        fibSeries[0] = 0;
        fibSeries[1] = 1;
        for (int i = 2; i <= n; i++){
            fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
        }
        
        return fibSeries[n];
    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) { 
//        /***
//        int lightspeed;
//        long days;
//        long seconds;
//        long distance;
//        Scanner scan = new Scanner(System.in);
//        String inputLine = scan.nextLine();
//        lightspeed = Integer.parseInt(inputLine);  
//        inputLine = scan.nextLine();
//        days = Integer.parseInt(inputLine);  
//        seconds = days * 24 * 60 * 60;
//        distance = lightspeed * seconds 
//        String distString = "" + distance;
//        System.out.println("In " + days + " Hello world " + 3.124215 + " " + '3');
//        System.out.println("days light will travel about");
//        System.out.println(distance + " miles");   
//        System.out.println(ArnabPrac.next(5+5));
//        System.out.println("N, Iter, Rec");
//        for (int n = 0; n <= 20; n++){
//            long recursiveStart = System.nanoTime();
//            ArnabPrac.fibonacci(n);
//            long recursiveEnd = System.nanoTime();
//            long recTime = recursiveEnd - recursiveStart;
//            long iterativeStart = System.nanoTime();
//            ArnabPrac.iterFibonacci(n);
//            long iterativeEnd = System.nanoTime();
//            long iterTime = (iterativeEnd - iterativeStart);
//            System.out.println(n + ", " + iterTime + ", " + recTime);
//        }
//        int[] arr = {2, 4, 5, 6, 3, 9};
//        List l = new List(arr);
//        l.printList();
//        StudentBase base = new StudentBase("Arnab", "12345");
//        System.out.println("Name : " + base.getName());
//        System.out.println("ID   : " + base.getID());
//        base.message();
//        
//        SchoolStudent schStd = new SchoolStudent(
//               "Saikat", "34567", "Kamilachri"
//        );
//        System.out.println("Name : " + schStd.getName());
//        System.out.println("ID   : " + schStd.getID());
//        System.out.println("Sch  : " + schStd.getSchoolName());
//        schStd.message();
//        
//        StudentBase baseObject = new SchoolStudent("abcde", "8909", "xyz");
//        System.out.println("Name : " + baseObject.getName());
//        System.out.println("ID   : " + baseObject.getID());
//        //System.out.println("Sch  : " + baseObject.getSchoolName());
//        baseObject.message();  
//        
//        int[] arr = {2, 5, 6, 3, 1, 9, 0};
//        SortedList list = new MySortedList(arr);
//        list.sortValues();
//        list.printNumbers();
//        * * ***/
//        /*RealState myHouse = new House(5000,  "Arnab", 10);
//        RealState myApt = new Apartment(2000, "Babu");
//        
//        System.out.println("House Utility : " + myHouse.getUtilityBill());
//        System.out.println("Apartment Utility : " + myApt.getUtilityBill());*/
//        List<Integer> l1 = new LinkedList<Integer>();
//        List<Integer> al = new ArrayList<Integer>();
//        int[] arr = {2, 3, 4, 5, 6, 8};
//        for(int i : arr){
//            l1.add(i);
//            al.add(i);
//        }
//        for (int n : l1){
//            System.out.println(n);
//        }
//    }
    
    
}

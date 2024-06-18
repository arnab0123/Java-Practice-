/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.list;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class SortedList {
    int[] numbers;
    
    public SortedList(int[] ns){
        this.numbers = ns;
    }
    
    public void sortValues(){
        Arrays.sort(this.numbers);
    }
    
    public void printNumbers(){
        for(int i = 0; i < this.numbers.length; i++){
            System.out.print(this.numbers[i] + ", ");
        }
        System.out.println("");
    }
}

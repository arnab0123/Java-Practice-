
package com.practice.list;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class MySortedList extends SortedList{
    public MySortedList(int[] ns){
        super(ns);
    }
    
    @Override
    public void sortValues(){
        super.sortValues();
        int n = this.numbers.length;
        for(int i = 0; i < (n/2); i++){
            int temp = this.numbers[i];
            this.numbers[i] =  this.numbers[n-i-1];
            this.numbers[n-i-1] = temp;
        }
    }
}

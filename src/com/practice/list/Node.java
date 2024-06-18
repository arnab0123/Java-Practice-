/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.list;

/**
 *
 * @author hp
 */
public class Node {
    private final int data;
    private Node next;
    
    public Node(int d){
        this.data = d;
        this.next = null;
    }
    
    public int getData(){
        return this.data;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node n){
        this.next = n;
    }
}

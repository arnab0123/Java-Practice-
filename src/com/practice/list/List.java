package com.practice.list;

/**
 *
 * @author hp
 */
public class List {
    private Node head;
    
    public List(){
        this.head = null;
    }
    
    public List(int[] arr){
        Node current = head;
        for(int i = 0; i < arr.length; i++){
            Node n = new Node(arr[i]);
            if (current != null){
                current.setNext(n);
            }
            else{
                head = n;
            }
            current = n;
        }
    }
    
    public void printList(){
        Node current = this.head;
        while (current != null){
            System.out.print(current.getData() + ", ");
            current = current.getNext();
        }
        System.out.println("");
    }
    
}

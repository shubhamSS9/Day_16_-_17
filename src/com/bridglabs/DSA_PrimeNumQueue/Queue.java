package com.bridglabs.DSA_PrimeNumQueue;

public class Queue<T> {
    Node<T> head;
    Node<T> tail;
    void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }

    void display(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
    }
}

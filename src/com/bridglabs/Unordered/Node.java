package com.bridglabs.Unordered;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }
}

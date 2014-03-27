import java.io.*;
import java.util.*;

public class DoubleLLCircle<E> {
    private class Node<E> {
	E data;
	Node<E> next, prev;

	public Node (E d){
	    this.data = d;
	}
	public String toString(){
	    return "" + data;
	}
	public void setData(E d){
	    data = d;
	}
	public E getData(){
	    return data;
	}
	public void setNext(Node<E> n){
	    next = n;
	}
	public Node<E> getNext(){
	    return next;
	}
	public void setPrev(Node<E> p) {
	    prev = p;
	}
	public Node<E> getPrev(){
	    return prev;
	}
    }

    private Node<E> current;
    private Node<E> head;
    private Node<E> tail;
    private int len;

    public DoubleLLCircle(){
	head = new Node<E>(null);
	tail = new Node<E>(null);
	head.setPrev(tail);
	head.setNext(tail);
	tail.setPrev(head);
	tail.setNext(head);
	len = 0;
    }
    
    public String toString(){
	if (len == 0)
	    return "";
	Node<E> tmp = head.getNext();
	int i = 0;
	String s = "";
	while (i < len){
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	    i = i + 1;
	} 
	return s;
    }

    public void insert(E d){
	if (len == 0){
	    current = new Node<E>(d);
	    head.setNext(current);
	    current.setPrev(head);
	    current.setNext(tail);
	    tail.setPrev(current);
	}
	else {
	    Node<E> tmp = new Node<E>(d);
	    current.getPrev().setNext(tmp);
	    tmp.setPrev(current.getPrev());
	    current.setPrev(tmp);
	    tmp.setNext(current);
	}
	len++;
    }

     public E getCurrent(){
	return current.getData();
    }

    public static void main(String[] args) {
	DoubleLLCircle<String> L = new DoubleLLCircle<String>();
	L.insert("Eddie");
	System.out.println(L);
	L.insert("Ariel");
	L.insert("Spring");
	System.out.println(L);
	System.out.println(L.getCurrent());
	
    }
}
    
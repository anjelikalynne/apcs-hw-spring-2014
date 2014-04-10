import java.io.*;
import java.util.*;

public class MyQueue{
    
    private Node head;
    private Node tail;
    private int length;

    public MyQueue(){
	head = null;
	tail = null;
	length = 0;
    }

    public void enqueue(String s){
	Node n = new Node(s);
	if (length == 0){ //or head == null
	    head = n;
	    tail = n;
	}
	else{
	    tail.setNext(n);
	    tail = n;
	}
	length++;
    }

    public String dequeue(){
	if (head == null){
	    return null;
	}
	String s;
	s = head.getData();
	head = head.getNext();
	if (head == null){
	    tail = null;
	}
	length--;
	return s;
    }

    public String front(){
	return head.getData();
    }

    public int size(){
	return length;
    }

    public boolean isEmpty(){
	return (head == null);
    }

    public String toString(){
	String s = "head --> ";
	Node tmp = head;
	if (head == null){
	    s = s + "null -->";
	}
	while (tmp != null){
	    s = s + tmp.getData() + " --> ";
	    tmp = tmp.getNext();
	}
	s = s.substring(0, s.length()-4);
	s = s + " <-- tail";
	return s;
    }
}
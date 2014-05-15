
import java.io.*;
import java.util.*;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node (int n){
	data = n;
	left = null;
	right = null;
    }

    public void setData (int n){
	data = n;
    }

    public String getData(){
	return ""+data;
    }

    public void setLeft(Node n){
	left = n;
    }

    public Node getLeft(){
	return left;
    }

    public void setRight(Node n){
	right = n;
    }

    public Node getRight(){
	return right;
    }

    public String toString(){
	return ""+data;
    }
}

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Node n = new Node(0);
	System.out.println(n);
	Node l = new Node(1);
	Node r = new Node(2);
	n.setLeft(l);
	n.setRight(r);
	System.out.println(n.getLeft());
	System.out.println(n.getRight());
    }
}
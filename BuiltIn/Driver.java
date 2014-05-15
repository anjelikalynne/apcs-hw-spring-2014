import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	//important: difference between map and set interface
	
	/*
	  time main functions
	  treemap:put function 
	  100000 : 67 ms
	  
	 */
	TreeMap tree = new TreeMap();
	long start = System.currentTimeMillis();
	tree.put(2, "Elphaba");
	tree.put(3, "Glinda");
	tree.put(1, "Wizard");
	for (int i = 0; i < 1000000; i++){
	    tree.put(i, "Wicked");
	}
	long elapsed = System.currentTimeMillis() - start;
	//System.out.println(tree);
	System.out.println(elapsed);

	TreeSet settee = new TreeSet();
	//so this thing is iterable
	settee.add("Munchkins");
	settee.add("Flying Monkeys");
	settee.add("Dorothy");
	System.out.println(settee);

       
	
    }
}
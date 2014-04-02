import java.util.*;
import java.io.*;

public class ItDriver{
    public static void main(String[] args){
	MyLinkedList<String> s = new MyLinkedList<String>();
	s.add("one");
	s.add("two");
	s.add("three");
	s.add("four");
	
	Iterator<String> i = s.iterator();
	while (i.hasNext()){
	    String x = i.next();
	    System.out.println(x);
	}
	
	for (String x2 : s)
	    System.out.println(x2);
    }
}
import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	MyLinkedList mll = new MyLinkedList();
	mll.add("Hercules");
	mll.add("Philoctetes");
	mll.add("Pegasus");
	System.out.println("The original length: " + mll.length());
	System.out.println("This is the first list:\n " + mll);
	mll.add("Megara",1);
	System.out.println();
	System.out.println("After adding Megara at position 1:\n" + mll);
	System.out.println("The new length: " + mll.length());
	System.out.println("At position 1: " + mll.get(1));
	System.out.println("At position 0: " + mll.get(0));
	String s = mll.set(2, "Hera");
	System.out.println();
	System.out.println("old string at position 2: " + s);
	System.out.println();
	System.out.println("After replacing Philoctetes at position 2 with Hera:\n" + mll);
	s = mll.remove(2);
	System.out.println();
	System.out.println("removed item at position 2: " + s);
	System.out.println("After removing Hera:\n" + mll);
	System.out.println("The length: " + mll.length());
	System.out.println("Finding Hera: " + mll.find("Hera"));
	System.out.println("Finding Meg: " + mll.find("Megara"));
    }
}

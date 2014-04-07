import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MyStackArray sa = new MyStackArray();
	sa.push("one");
	sa.push("two");
	sa.push("three");
	System.out.println(sa);
    }
}
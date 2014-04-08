import java.io.*;
import java.util.*;

public class MyStackArray {
    private String[] stackArray;
    private int top;

    public MyStackArray(){
	stackArray = new String[10];
	top = -1;
    }

    public void push(String s){
	if (top > stackArray.length)
	    grow();
	top++;
	stackArray[top] = s;
    }

    public String peek(){
	return stackArray[top];
    }

    public String pop(){
	String popped = peek();
	top--;
	return popped;
    }

    public void grow(){
	int l = stackArray.length;
	String[] tmp = new String[l + (l/2)];
	for (int i = 0; i <= top; i++){
	    tmp[i] = stackArray[i];
	}
	stackArray = tmp;
    }

    public String toString(){
	String s = "";
	if (top >= 0){
	    for (int i = top; i >= 0; i--){
		s = s + stackArray[i] + ", ";
	    }
	}
	return s;

    }
    
}
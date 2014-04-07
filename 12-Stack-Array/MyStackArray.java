import java.io.*;
import java.util.*;

public class MyStackArray {
    private String[] stackArray;
    private String top;
    private int len;

    public MyStackArray(){
	stackArray = new String[10];
	top = null;
	len = 0;
    }

    public void push(String s){
	for (int i = len; i > 0; i--){
	    stackArray[i + 1] = stackArray[i];
	}
	stackArray[0] = s;
	top = stackArray[0];
	len++;
    }

    public String peek(){
	return top;
    }

    public String pop(){
	String popped = top;
	for (int i = 0; i < len; i++){
	    stackArray[i] = stackArray[i+1];
	}
	return popped;
    }

    public void grow(){
	int l = stackArray.length;
	String[] tmp = new String[l + (l/2)];
	for (int i = 0; i < len; i++){
	    tmp[i] = stackArray[i];
	}
	stackArray = tmp;
    }

    public String toString(){
	int i = 0;
	String s = "";
	while (i < len){
	    s = s + stackArray[i] + " ,";
	}
	return s;
    }
    
}
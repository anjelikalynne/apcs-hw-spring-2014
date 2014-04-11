import java.io.*;
import java.util.*;

public class MyArrayQueue{
    private int[] lunchLine;
    private int head, tail;
    
    public MyArrayQueue(){
	lunchLine = new int[10];
	head = 0;
	tail = 0;
    }

    public void enqueue(int n){
	tail = tail + 1;
	lunchLine[tail] = n;
    }

    public int dequeue(int n){
	if (head == tail)
	    return 0;
	else {
	    int ret = lunchLine[head];
	    if (head == (lunchLine.length - 1))
		head = 0;
	    else
		head = head - 1;
	    return ret;
	}
    }

    
}
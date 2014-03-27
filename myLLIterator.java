import java.io.*;
import java.util.*;

public class myLLIterator<E> implements Iterator<E>{
    private Node currentNode;
    private boolean calledNext;

    public myLLIterator<E> (Node n){
	currentNode = n;
    }
    
    public boolean hasNext(){
	if (currentNode.getNext() == null)
	    return false;
	else{
	    currentNode = currentNode.getNext();
	    return true;
	}
    }

    public E next(){
	if (hasNext()){
	    calledNext = true;
	    return currentNode.getNext();
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	if (calledNext == true){
	    
	}
    }
}
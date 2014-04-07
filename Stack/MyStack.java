import java.io.*;
import java.util.*;

public class MyStack {
    private Node top;
    private int numElts;
    
    //constructor
    public MyStack(){
	top = null;
    }

    //push
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElts = numElts + 1;
    }

    //pop
    public String pop(){
	String s = top.getData();
	top = top.getNext();
	numElts = numElts - 1;
	return s;
    }

    //peek
    public String peek(){
	return top.getData();
    }

    //isEmpty
    public boolean isEmpty(){
	return top == null;
    }

    //toString
    public String toString(){
	String tmp = "";
	Node currentNode = top;
	while (currentNode != null){
	    tmp += currentNode.getData() + ",  ";
	    currentNode = currentNode.getNext();
	}
	return tmp;
    }

    public int getSize(){
	return numElts;
    }
}

/*
I'm not much of a gamer so I just heard about this recently;
There's this thing called twitch pokemon;
so we're going to do twitch programming;
Fawn is like, this can't end well;

We should make it even less, one word per person so it's more entertaining;

Who came up with this idea?;
Mr. K.;

Fawn is more effective;
I could've interrupted anywhere there;

Strategies:;
change a variable name;
add a comment;
 
we just did the thousand monkeys;
I'm the typewriter;
Don't insult the monkeys;
genetically enhanced superior monkeys that have take over the planet;
*/
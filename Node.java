
public class Node {
    private String data;
    private Node next;

    public Node (String s){
	data = s;
	next = null;
    }

    public void setData (String s){
	data = s;
    }

    public String getData(){
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return data;
    }
}

/*
public static void main(String[] args){
    Node n1;
    n1 = new Node("Tommy");
    System.out.println(n1);
    Node n2 = new Node("Sammy");
    System.out.println(n2);
    n1.setNext(n2);
    System.out.println(n1.getNext());
    n2.setNext( new Node("Clyde") );
    System.out.println( n1.getNext().getNext() );
    n1.setNext( n1.getNext().getNext() );
}
*/
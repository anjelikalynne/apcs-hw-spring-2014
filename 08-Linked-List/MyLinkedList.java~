public class MyLinkedList {
    private Node head;

    public MyLinkedList(){
	head = null;
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
    }

    public String toString(){
	String s = new String();
	Node tmp = head;
	while (tmp != null){
	    s += tmp.getData();
	    tmp = tmp.getNext();
	}
	return s;
    }

    //add @ location i (0 at front) error if you try to add past the end
    public void add(int i, String s){
	if (i == 0)
	    add(s);
	else {
	    try{
		Node tmp = head;
		Node toAdd = new Node(s);
		for (int l = 0; l <= i; l++){
		    tmp = tmp.getNext();
		}
		toAdd.setNext(tmp.getNext());
		tmp.setNext(toAdd);
	    }
	    catch (Exception e){
		System.out.println(e);
	    }
	}
    }

    //returns the string @ location i
    public String get(int i){
	Node tmp = head;
	for (int l = 0; l <= i; l++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }

    //sets the location i to s returns old value
    public String set(int i, String s){
	for (int l = 0; l <= i; l++){
	    tmp = tmp.getNext();
	}
	String old = tmp.getData();
	tmp.setData(s);
	return old;
    }
    
    //removes item @ location i returns old value
    public String remove (int i){
	
    }

    //returns location of item w/ value s or -1 if not found 
    public int find(String s){

    }

    public int length(){

    }
}

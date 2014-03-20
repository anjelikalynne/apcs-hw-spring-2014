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
	Node tmp = head;
	for (int l = 0; l <= i; l++){
	    tmp = tmp.getNext();
	}
	String old = tmp.getData();
	tmp.setData(s);
	return old;
    }
    
    //removes item @ location i returns old value
    public String remove (int i){
	Node tmp = head;
	for (int l = 0; l < i; l++){
	    tmp = tmp.getNext();
	}
	tmp.setNext(tmp.getNext().getNext());
	String old = tmp.getNext().getData();
	return old;
    }

    //returns location of item w/ value s or -1 if not found 
    public int find(String s){
	Node tmp = head;
	int ret = -1;
	int i = 0;
	while (tmp != null){
	    if (tmp.getData() == s)
		return i;
	    tmp = tmp.getNext();
	    i++;
	}
	return ret;
    }

    public int length(){
	int len = 0;
	Node tmp = head;
	while (tmp!= null){
	    tmp = tmp.getNext();
	    len++;
	}
	return len;
    }
}

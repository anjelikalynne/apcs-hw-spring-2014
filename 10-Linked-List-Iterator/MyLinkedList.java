public class MyLinkedList<E> {
    private Node head;
    private int len;

    public MyLinkedList<E>(){
	head = new Node("dummy");
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	Node t2 = head.getNext();
	head.setNext(tmp);
	tmp.setNext(t2);
	len = len + 1;
    }

    public String toString(){
	String s = new String();
	Node tmp = head.getNext();
	for (int i = 0; i < len; i++){
	    s += tmp.getData() + "\n";
	    //  if (tmp.getNext() != null)
	    tmp = tmp.getNext();
	}
	return s;
    }

    //add @ location i (0 at front) error if you try to add past the end
    public void add(String s, int i){
	if (i > len)
	    System.out.println("out of bounds");
	else {
	    Node tmp = head.getNext();
	    Node t2 = head;
	    Node toAdd = new Node(s);
	    for (int l = 0; l < i; l++){
		t2 = tmp;
		tmp = tmp.getNext();
	    }
	    t2.setNext(toAdd);
	    toAdd.setNext(tmp);
	    len = len + 1;
	}
    }

    //returns the string @ location i
    public String get(int i){
	Node tmp = head.getNext();
	for (int l = 0; l < i; l++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }

    //sets the location i to s returns old value
    public String set(int i, String s){
	Node tmp = head.getNext();
	for (int l = 0; l < i; l++){
	    tmp = tmp.getNext();
	}
	String old = tmp.getData();
	tmp.setData(s);
	return old;
    }
    
    //removes item @ location i returns old value
    public String remove (int i){
	Node tmp = head.getNext();
	Node t2 = head;
	for (int l = 0; l < i; l++){
	    t2 = tmp;
	    tmp = tmp.getNext();
	}
	t2.setNext(tmp.getNext());
	String old = tmp.getData();
	len = len - 1;
	return old;
    }

    //returns location of item w/ value s or -1 if not found 
    public int find(String s){
	Node tmp = head.getNext();
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
	return len;
    }
}

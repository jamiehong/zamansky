import java.lang.*;
public class MyLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(){
  	head = new Node("");
	tail = head;
	size = 0;
    }
    
  public void add(String d) {
      Node tmp = new Node(d);
      tail.setNext(temp);
      tail = temp;
      size++;
  }
    
    public String toString() {
  	String s= "[ ";
	Node n = head.getNext();
	while(n.getNext() != null){
	    s = s + " , " + n;
	    n = n.getNext();
	}
	s.substring(0,s.length()-2);     
	s = s + " ]";
	return s;
    }

    public void add(int i, String s){
	if (i > this.length()){
	    throw new IndexOutOfBoundsException();
	}else{
	    Node insert = new Node(s);
	    Node n = head.getNext();
	    Node temp;
	    int counter = 0;
	    while (n.getNext() != null){
		if (counter == i - 1){
		    temp = n.getNext();
		n.setNext(insert);
		insert.setNext(temp);
		}
		n = n.getNext();
	    }size ++;
	}
    }
    
    public String get(int i){
	Node n = head.getNext();
	for (int x = 0; x <= i; x++){
	    if(x == i){
		return n.toString();
	    }n = n.getNext(); 
	}
	return ""+i;
    }
    
    public String set(int i, String s){
	if (i >= this.length()){
	    throw new IndexOutOfBoundsException();
	}else{
	    Node n = head.getNext();
	    int counter = 0;
	    Node insert = new Node(s);
	    while (n.getNext()!= null){
		if (counter == i - 1){
		    Node temp = n.getNext();
		    Node tempnext = temp.getNext();
		    n.setNext(insert);
		    insert.setNext(tempnext);
		    return temp.toString();
		}
		counter++;
		n = n.getNext();
	    }
	}return "error";
    }
    
    
    public String remove(int i){
	if (i >= this.length()){
	    throw new IndexOutOfBoundsException();
	}else{
	    Node n = head;
	    int counter = 0;
	    while (n.getNext() != null){
		if (counter == i -1){
		    Node temp = n.getNext();
		    Node tempnext = temp.getNext();
		    n.setNext(tempnext);
		    size --;
		    return temp.toString();
		}
		counter ++;
		n = n.getNext();
	    }
	    return -1;
	}
    }

    public int length(){
	return size;
    }
}

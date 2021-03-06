import java.lang.*;
public class MyLinkedList{
  private Node head;

  public MyLinkedList() {
  	head = null;
  }
    
  public void add(String d) {
  	Node tmp = new Node(d);
	  tmp.setNext(head);
  	head=tmp;
  }
  
  public String toString() {
  	String s= "[ ";
	Node n = head;
	while(n.getNext() != null){
	      s = s + " , " + n;
	      n = n.getNext();
	  }
	s.substring(0,s.length()-2);     
	s = s + " ]";
	return s;
  }
    //I did the hw in order, so the length method is later on
    public void add(int i, String s){
	if (i > this.length()){
	    throw new IndexOutOfBoundsException();
	}
	Node insert = new Node(s);
	Node n = head;
	Node temp;
	int counter = 0;
	while (n.getNext() != null){
	    if (counter == i - 1){
		temp = n.getNext();
		n.setNext(insert);
		insert.setNext(temp);
	    }
	    n = n.getNext();
	}
    }

    public String get(int i){
	Node n = head;
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
	    Node n = head;
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
	}
    }


    //for remove i'm not sure what you mean by "exception on error"
    //besides if the i is more than length, I didnt throw anything else
    public String remove(int i){
	if (i >= this.length()){
	    throw new IndexOutOfBoundsException();
	}
	Node n = head;
	int counter = 0;
	while (n.getNext() != null){
	    if (counter == i -1){
		Node temp = n.getNext();
		Node tempnext = temp.getNext();
		n.setNext(tempnext);
		return temp.toString();
	    }
	    n = n.getNext();
	    counter++;
	}
    }

    //public String find(int i){
    //this is the same as get???
    //}

    public int length(){
	int counter = 0;
	Node n = head;
	while (n.getNext() != null){
	    counter ++;
	    n = n.getNext();
	}
	return counter;
    }
}

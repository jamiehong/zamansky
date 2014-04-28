public BST{

    private Node root;

    public BST(){
	root = null;
    }
    public BST(Node n){
	root = n;
    }
    public BST(int n){
	root = new Node(n);
    }

    public void insert(int n){
	if (root = null){
	    root = new Node(n);
	}else inserthelper(n, root);
    }

    public void inserthelper(int n, Node current){
	if (n < current.getData()){
	    if (current.getLeft.getData() == null){
		current.setLeft(n);
	    }else{
		inserthelper(n, current.getLeft());
	    }
	}else {
	    if (current.getRight.getData() == null;){
		current.setRight(n);
	    }else{
		inserthelper(n, current.getRight());
	    }
	}
    }


    public Node search(int d){
	    Node temp = root;
	    while (temp != null) {
		if (temp.getData() == d )
		    return temp;
		if (d > temp.getData()) 
		    temp = temp.getRight();
		else 
		    temp = temp.getLeft();
	    }
	    return null;
    }

    public Node search2(Node c, int x) {
	if (c == null)
	    return null;
	if (c.getData() == x)
	    return c;
	if ( d > c.getData() ) {
	    return search2( c.getRight(), x);
	}
	else {
	    return search2( c.getLeft(), x);
	}
    }
    
}
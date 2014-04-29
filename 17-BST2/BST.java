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

    public void insert(Node n){
	if (root = null){
	    root = n;
	}else inserthelper(n, root);
    }

    public void inserthelper(Node n, Node current){
	if (n.getData() < current.getData()){
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

    public void insert(int n){
	temp = new Node(n);
	insert(temp);
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

    public Node search2(int x){
	return search2(root, x);
    }
    public Node search2(Node c, int x) {
	if (c == null)
	    return null;
	if (c.getData() == x)
	    return c;
	if ( d > c.getData() ) {
	    return search2(c.getRight(), x);
	}
	else {
	    return search2(c.getLeft(), x);
	}
    }

    public void delete(Node n){
	Node temp;
	Node current = root;
	if(n.getData() == root.getData()){
	    root = null;
	}
	while (current != null){
	    temp = current;
	    if (n.getData() < current.getData()){
		if (current.getLeft.getData() == n.getData()){
			current.setLeft(current.getLeft.getLeft());
			this.insert(temp.getRight());
		}else{
		    current = current.getLeft();
		}
	    }
	    else{

    }
    
}
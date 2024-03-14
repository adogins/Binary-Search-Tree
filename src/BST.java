class Node {
    private int key;
    private Node parent;
    private Node leftChild;
    private Node rightChild;

    // Constructors
    Node() {
        this.key = -1;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    } // Node (Constructor)
    Node(int key) {
        this.key = key;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    } // Node (Constructor)
    Node(int key, Node parent, Node leftChild, Node rightChild) {
        this.key = key;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    } // Node (Constructor)

    // Getters
    public int getKey() {
        return this.key;
    } // getKey
    public Node getParent() {
        return this.parent;
    } // getParent
    public Node getLeftChild() {
        return this.leftChild;
    } // getLeftChild
    public Node getRightChild() {
        return this.rightChild;
    } // getRightChild

    // Setters
    public void setKey(int key){
        this.key = key;
    } // setKey
    public void setParent(Node parent) {
        this.parent = parent;  
    } // setParent
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    } // setLeftChild
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    } // setRightChild
} // Node (Class)
class BST {
    private Node root;
    private int counter;

    // Constructors
    public BST() {
        this.root = null;
        this.counter = 0;
    } // BST (Contructor)

    // Methods
    public int size() {
        return this.counter;
    } // size
    
    public void insert(int element) {
        // Exception for improper input
        if (element < 0) {
            throw new IllegalArgumentException("The number entered is negative. Enter a nonnegative number.");
        } // if
        if (search(element) != null) {
            System.out.println("Element is already in the tree!");
        } else {
            Node current = this.root;
            boolean inserting = true;
            // Adds a root
            if (this.size() == 0) {
                this.root = new Node(element);
                this.counter++;
            } else {
                while(inserting) {
                    // If the element is less than the current node
                    if (element < current.getKey()) {
                        if (current.getLeftChild() != null) {
                            current = current.getLeftChild();
                        } else {
                            current.setLeftChild(new Node(element, current,null, null));
                            inserting = false;
                            this.counter++;
                        } // if 
                    } else {
                        // If the element is greater than the current node
                        if (current.getRightChild() != null) {
                            current = current.getRightChild();
                        } else {
                            current.setRightChild(new Node(element, current, null, null));
                            inserting = false;
                            this.counter++;
                        } // if
                    } // if
                } // while
            } // if
        } // if
    } // insert

    public void delete(int element) {
        if (search(element) == null) {
            System.out.println("Element not found!");
        } else {
            Node nodeToDelete = search(element);
            Node replacement = null;
            if (nodeToDelete.equals(this.root)) {
                Node r = this.root.getRightChild();
                Node l = this.root.getLeftChild();
                if (r == null) {
                    Node n = this.root.getLeftChild();
                    while(n.getRightChild() != null) {
                        n = n.getRightChild();
                    } // while
                    if (n.equals(l)) {
                        n.setParent(null);
                        n.setRightChild(r);
                    } else {
                        n.getParent().setRightChild(null);
                        n.setParent(null);
                        n.setLeftChild(l);
                        l.setParent(n);
                        n.setRightChild(r);
                    } // if
                    this.root = n;
                } else {
                    Node n = this.root.getRightChild();
                    while (n.getLeftChild() != null) {
                        n = n.getLeftChild();
                    } // while
                    if (n.equals(r)) {
                        n.setParent(null);
                        n.setLeftChild(l);
                        l.setParent(n);
                    } else {
                        n.getParent().setLeftChild(null);
                        n.setParent(null);
                        n.setLeftChild(l);
                        l.setParent(n);
                        n.setRightChild(r);
                        r.setParent(n);
                    } // if
                    this.root = n;
            } // if
            } else {
                if (isLeaf(nodeToDelete)){
                    Node p = nodeToDelete.getParent();
                    //nodeToDelete.setParent(null);
                    if (p.getLeftChild() != null) {
                        if (p.getLeftChild().equals(nodeToDelete)) {
                            p.setLeftChild(null);
                        } // if
                    } // if
                    if (p.getRightChild() != null) {
                        if (p.getRightChild().equals(nodeToDelete)) {
                            p.setRightChild(null);
                        } // if
                    } // fi
                    nodeToDelete.setParent(null);
                } else {
                    if (hasOneChild(nodeToDelete)) {
                        Node p = nodeToDelete.getParent();
                        if (nodeToDelete.getLeftChild() != null) {
                            replacement = nodeToDelete.getLeftChild();
                            nodeToDelete.setLeftChild(null);
                        } else {
                            replacement = nodeToDelete.getRightChild();
                            nodeToDelete.setLeftChild(null);
                        } // if
                        if (replacement.getKey() < p.getKey()) {
                            nodeToDelete.setParent(null);
                            p.setLeftChild(replacement);
                            replacement.setParent(p);
                        } else {
                            nodeToDelete.setParent(null);
                            p.setRightChild(replacement);
                            replacement.setParent(p);
                        } // if 
                    } else {
                        Node p = nodeToDelete.getParent();
                        Node l = nodeToDelete.getLeftChild();
                        Node r = nodeToDelete.getRightChild();

                    if (element < this.root.getKey()) {
                            Node n = nodeToDelete;
                            while (n.getRightChild() != null) {
                                n = n.getRightChild();
                            } // while
                            n.setParent(p);
                            if (p != null) {
                                p.setRightChild(n);
                            } // if
                            n.setLeftChild(l);
                            if (!n.equals(r)) {
                                n.setRightChild(r);
                            } // if
                        } else {
                            Node n = nodeToDelete;
                            while (n.getLeftChild() != null) {
                                n = n.getLeftChild();
                            } // while
                            n.setParent(p);
                            if (p != null) {
                                p.setLeftChild(n);
                            } // if
                            n.setRightChild(r);
                            if (!n.equals(l)) {
                                n.setLeftChild(l);
                            } // if
                        } // if
                    } // if
                } // if
            } // if
            this.counter--;
        } // if
    } // delete

    public void preorder() {
        if (this.size() == 0) {
            System.out.println("The tree is empty.");
        } else {
            recursivePreorder(this.root);
            System.out.println();
        } // if
    } // preorder

    public void postorder() {
        if (this.size() == 0) {
            System.out.println("The tree is empty.");
        } else {
            recursivePostorder(this.root);
            System.out.println();
        } // if
    } // postorder

    public void inorder() {
        if (this.size() == 0) {
            System.out.println("The tree is empty.");
        } else {
            recursiveInorder(this.root);
            System.out.println();
        } // if
    } // inorder

    // Searches for a node by the element it holds and returns the address of the node
    private Node search(int element) {
        Node current = this.root;
        while (current != null) {
            if (current.getKey() == element) {
                return current;
            } else {
                if (element < current.getKey()) {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                } // if
            } // if
        } // while
        return null;
    } // search
    private boolean isLeaf(Node n) {
        if (n.getLeftChild() == null && n.getRightChild() == null) {
            return true;
        } else {
            return false;
        } // if
    } // isLeaf
    private boolean hasOneChild(Node n) {
        if (n.getLeftChild() != null && n.getRightChild() == null) {
            return true;
        } // if
        if (n.getRightChild() != null && n.getLeftChild() == null) {
            return true;
        } // if
        return false;
    } // hasOneChild
    private void recursivePreorder(Node n) {
        if (n == null) {
            return;
        } else {
            System.out.print(n.getKey() + " ");
            recursivePreorder(n.getLeftChild());
            recursivePreorder(n.getRightChild());
        } // if
    } // recursivePreorder
    private void recursivePostorder(Node n) {
        if (n == null) {
            return;
        } else {
            recursivePostorder(n.getLeftChild());
            recursivePostorder(n.getRightChild());
            System.out.print(n.getKey() + " ");
        } // if 
    } // recursivePostorder
    private void recursiveInorder(Node n) {
        if (n == null) {
            return;
        } else {
            recursiveInorder(n.getLeftChild());
            System.out.print(n.getKey() + " ");
            recursiveInorder(n.getRightChild());
        } // if
    } // recursiveInorder
} // BST (Class)
/**
* Creates node that can be "linked" together through references.
*/
class Node {
    private int key;
    private Node parent;
    private Node leftChild;
    private Node rightChild;

    // Constructors

    /**
     * Creates an empty node with no determined factors.
     */
    Node() {
        this.key = -1;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    } // Node (Constructor)

    /**
     * Creates a node with a defined key.
     * @param key is a defined value the node holds.
     */
    Node(int key) {
        this.key = key;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    } // Node (Constructor)

    /**
     * Creates a node with a defined key, parent, left child, and right child.
     * @param key is the defined value the node holds.
     * @param parent is a reference to the node that is the parent of the current node.
     * @param leftChild is a reference to the node that has a key that is less than the current node.
     * @param rightChild is a reference to the node that has a key that is greater than the current node.
     */
    Node(int key, Node parent, Node leftChild, Node rightChild) {
        this.key = key;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    } // Node (Constructor)

    // Getters
    /**
     * @return the key of the calling node.
     */
    public int getKey() {
        return this.key;
    } // getKey

    /**
     * @return the reference to the parent node of the calling node.
     */
    public Node getParent() {
        return this.parent;
    } // getParent

    /**
     * @return the reference to the left child node of the calling node.
     */
    public Node getLeftChild() {
        return this.leftChild;
    } // getLeftChild

    /**
     * @return the reference to the right child node of the calling node.
     */
    public Node getRightChild() {
        return this.rightChild;
    } // getRightChild

    // Setters

    /**
     * Sets the key of the node to the given int.
     * @param key the defined int value for the key.
     */
    public void setKey(int key){
        this.key = key;
    } // setKey

    /**
     * Sets the parent node to the given node.
     * @param parent a reference to a node that should be the current node's parent.
     */
    public void setParent(Node parent) {
        this.parent = parent;  
    } // setParent

    /**
     * Sets the left child node to the given node.
     * @param leftChild a reference to a node that should be the current node's left child.
     */
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    } // setLeftChild

    /**
     * Sets the right child node to the given node.
     * @param rightChild a reference to a node that should be the current node's right child.
     */
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    } // setRightChild
} // Node (Class)

/**
* Creates a binary tree which stores the a value for the key and 
* stores references to the parent node, left child node and right
* child node. Also allows functions to be performed and retrieved 
* from the tree. 
*/
class BST {
    private Node root;
    private int counter;

    // Constructors
    public BST() {
        this.root = null;
        this.counter = 0;
    } // BST (Contructor)

    // Methods
    
    /**
     * @return the number of nodes in the tree.
     */
    public int size() {
        return this.counter;
    } // size
     
    /**
     * Allows a new node containing a nonnegative int to be added to the Binary Search Tree (BST). 
     * If the element is greater than the one in the current node it goes to the right until an "empty" space is found.
     * If the element is less than the one in the current node it goes to the left until an "empty" space is found.
     * @param element is the int that's beign added in a new node in the tree.
     */
    public void insert(int element) {
        // Exception for improper input
        if (element < 0) {
            System.out.println("The number entered is negative. Enter a nonnegative integer.");
        } else {
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
        } // if
    } // insert

    /**
     * Allows a specific node containing the element to be removed from the tree while readjusting the children
     * to comply with the contraints of a Binary Search Tree. 
     * @param element is the int that identifies the value and node to remove from the tree.
     */
    public void delete(int element) {
        if (search(element) == null) {
            System.out.println("Element not found!");
        } else {
            Node nodeToDelete = search(element);
            Node replacement = null;
            // Deletes root and makes replacement
            if (nodeToDelete.equals(this.root)) {
                Node r = this.root.getRightChild();
                Node l = this.root.getLeftChild();
                // Pulls from right subtree of root
                if (l == null) {
                    Node n = this.root.getRightChild();
                    while (n.getLeftChild() != null) {
                        n = n.getLeftChild();
                    } // while
                    if (n.equals(r)) {
                        n.setParent(null);
                        n.setLeftChild(l);
                    } else {
                        n.getParent().setLeftChild(null);
                        if (n.getParent().getLeftChild() != null) {
                            n.getParent().setRightChild((n.getLeftChild()));
                        } // if
                        n.setParent(null);
                        n.setLeftChild(l);
                        n.setRightChild(r);
                        r.setParent(n);
                    } // if
                    this.root = n;
                // pulls from left subtree of root
                } else {
                    Node n = this.root.getLeftChild();
                    while(n.getRightChild() != null) {
                        n = n.getRightChild();
                    } // while
                    if (n.equals(l)) {
                        n.setParent(null);
                        n.setRightChild(r);
                    } else {
                        n.getParent().setRightChild(null);
                        if (n.getLeftChild() != null) {
                            n.getParent().setRightChild(n.getLeftChild());
                        } // if
                        n.setParent(null);
                        n.setLeftChild(l);
                        if (l != null) {
                            l.setParent(n);
                        } // if
                        n.setRightChild(r);
                        if (r != null) {
                            r.setParent(n);
                        } // if
                    } // if
                    this.root = n;
                } // if
            } else {
                // Removes node if the node is a leaf
                if (isLeaf(nodeToDelete)){
                    Node p = nodeToDelete.getParent();
                    if (p.getLeftChild() != null) {
                        if (p.getLeftChild().equals(nodeToDelete)) {
                            p.setLeftChild(null);
                        } // if
                    } // if
                    if (p.getRightChild() != null) {
                        if (p.getRightChild().equals(nodeToDelete)) {
                            p.setRightChild(null);
                        } // if
                    } // if
                    nodeToDelete.setParent(null);
                } else {
                    // removes node if node only has one child
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
                        // removes node if node has two children and pulls predecessor as replacement
                        Node p = nodeToDelete.getParent();
                        Node l = nodeToDelete.getLeftChild();
                        Node r = nodeToDelete.getRightChild();
                        nodeToDelete.setParent(null);
                        nodeToDelete.setLeftChild(null);
                        nodeToDelete.setRightChild(null);
                        if (l != null) {
                            // left subtree under deleted node
                            Node node = l;
                            while (node.getRightChild() != null) {
                                node = node.getRightChild();
                            } // while
                            Node nodeParent = node.getParent();
                            Node nodeChild = node.getLeftChild();
                            if (nodeChild != null) {
                                nodeChild.setParent(nodeParent);
                                nodeParent.setRightChild(nodeChild);
                            } else {
                                nodeParent.setRightChild(null);
                            } // if 
                            node.setParent(p);
                            if (p.equals(this.root) && node.getKey() < p.getKey()) {
                                p.setLeftChild(node);  
                            } else if (node.getKey() < p.getKey()) {
                                p.setLeftChild(node);
                            } else {
                                p.setRightChild(node);
                            } // if
                            if (node != r) {
                                node.setRightChild(r);
                            } // if
                            if (node != l) {
                                node.setLeftChild(l);
                            } // if
                            if (l != null) {
                                l.setParent(node);
                            } // if
                            if (r != null) {
                                r.setParent(node);
                            } // if
                        } else {
                            // right subtree under deleted node
                            Node node = r;
                            while (node.getLeftChild() != null) {
                                node = node.getLeftChild();
                            } // while
                            Node nodeParent = node.getParent();
                            Node nodeChild = node.getRightChild();
                            if (nodeChild != null) {
                                nodeChild.setParent(nodeParent);
                                nodeParent.setLeftChild(nodeChild);
                            } // if
                            node.setParent(p);
                            if (p.equals(this.root)) {
                                p.setRightChild(node);
                            } else {
                                p.setLeftChild(node);
                            } // if
                            nodeParent.setLeftChild(null);
                            if (node != l) {
                               node.setLeftChild(l); 
                            } // if
                            if (node != r) {
                                node.setRightChild(r);
                            } // if
                            if (r != null) {
                                r.setParent(node);
                            } // if
                        } // if
                    } // if 
                } // if
            } // if
            this.counter--;
        } // if
    } // delete

    /**
     * Prints the elements of the tree in the order defined by preorder (current, left, right).
     */
    public void preorder() {
        if (this.size() == 0) {
            System.out.println("The tree is empty.");
        } else {
            recursivePreorder(this.root);
            System.out.println();
        } // if
    } // preorder

    /**
     * Prints the elements of the tree in the order defined by postorder (left, right, current).
     */
    public void postorder() {
        if (this.size() == 0) {
            System.out.println("The tree is empty.");
        } else {
            recursivePostorder(this.root);
            System.out.println();
        } // if
    } // postorder

    /**
     * Prints the elements of the tree in the order in increasing order (left, current, right).
     */
    public void inorder() {
        if (this.size() == 0) {
            System.out.println("The tree is empty.");
        } else {
            recursiveInorder(this.root);
            System.out.println();
        } // if
    } // inorder
    
    /**
     * Looks for a specific element in the tree.
     * @param element is the number being searched for in the tree.
     * @return the Node that the element is located in or null if the element isn't in the tree.
     */
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

    /**
     * Determines if a specific node is a leaf in the tree.
     * @param n is the node that's being evaulated as a leaf or not.
     * @return true if the node is a leaf (both children are null).
     * @return false if the node is not a leaf (one or both children are not null).
     */
    private boolean isLeaf(Node n) {
        if (n.getLeftChild() == null && n.getRightChild() == null) {
            return true;
        } else {
            return false;
        } // if
    } // isLeaf

    /**
     * Determines is a specific node only has one child.
     * @param n is the node to evaluate.
     * @return true if the node has a right/left child that's null and a right/left child that's not null.
     * @return false if the node's children are both null, or both are not null.
     */
    private boolean hasOneChild(Node n) {
        if (n.getLeftChild() != null && n.getRightChild() == null) {
            return true;
        } // if
        if (n.getRightChild() != null && n.getLeftChild() == null) {
            return true;
        } // if
        return false;
    } // hasOneChild

    /**
     * Recursively prints out the elements of the tree in preorder.
     * @param n is the node to start at.
     */
    private void recursivePreorder(Node n) {
        if (n == null) {
            return;
        } else {
            System.out.print(n.getKey() + " ");
            recursivePreorder(n.getLeftChild());
            recursivePreorder(n.getRightChild());
        } // if
    } // recursivePreorder

    /**
     * Recursively prints out the elements of the tree in postorder.
     * @param n is the node to start at.
     */
    private void recursivePostorder(Node n) {
        if (n == null) {
            return;
        } else {
            recursivePostorder(n.getLeftChild());
            recursivePostorder(n.getRightChild());
            System.out.print(n.getKey() + " ");
        } // if 
    } // recursivePostorder

    /**
     * Recursively prints out the elements of the tree in inorder.
     * @param n is the node to start at.
     */
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
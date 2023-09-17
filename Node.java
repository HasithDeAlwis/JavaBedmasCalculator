public class Node {
    //Either a number or an operator (ie. *, /, + etc.)
    String cargo;
    //Points to the next node that is linked to the current node
    Node next;
    //Determines whether or not a piece of cargo is an operation or not
    Boolean isOperation;

    //Constructors for the Node class
    public Node()
    {
        this.next = null;
        this.cargo = null;
        this.isOperation = null;
    }

    public Node(String cargo, Node next)
    {
        this.next = next;
        this.cargo = cargo;
        this.isOperation = null;
    }
    
    public Node(String cargo)
    {
        this.next = null;
        this.cargo = cargo;
        this.isOperation = null;
    }
}

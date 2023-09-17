public class Node {
    String cargo;
    Node next;
    Boolean isOperation;

    public Node()
    {
        this.next = null;
        this.cargo = null;
        this.isOperation = null;
    }

    public Node(Node next, String cargo)
    {
        this.next = next;
        this.cargo = cargo;
        this.isOperation = null;
    }
}

public class Stack {
    //Top of the stack
    Node head;
    

    //Constructors for Stack
    public Stack()
    {
        this.head = null;
    }

    public Stack(Node head)
    {
        this.head = head;
    }

    /**
     * This method adds a new node at the top off the stack with a specified cargo
     * @param cargo The cargo for the next element
     */
    public void push(String cargo)
    {
        //Make this.head.next point to the original top of the stack and change its cargo
        this.head = new Node(cargo, this.head);
    }
    /**
     * Remove the top most element of a stack
     * @return The node of the top most element
     */
    public Node pop()
    {
        //Dummy node
        Node holder = this.head;
        //make this.head equal to the next Node, removing that node from the stack
        this.head = this.head.next;
        //Return the dummy node
        return holder;
    }
}

public class Stack extends LinkedList{
    

    //Constructors for Stack
    public Stack()
    {
        this.head = new Node(null, null);
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
        //call addFirst(String cargo) method from the parent class to push an element
        addFirst(cargo);
    }
    /**
     * Remove the top most element of a stack
     * @return The node of the top most element
     */
    public Node pop()
    {
        //call remove first in parent class
        return removeFirst();

    }
}

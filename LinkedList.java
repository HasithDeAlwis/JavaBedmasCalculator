public class LinkedList {
    Node head;
    short length; 

    //LinkedList constructors
    public LinkedList()
    {
        this.head = null;
        length = 0;
    }

    public LinkedList(Node head)
    {
        this.head = head;
        length = 1;
    }

    public LinkedList(Node head, short length)
    {
        this.head = head;
        this.length = length;
    }
    /**
     * Returns the node that is in a desired index
     * @param position position of the desired element in the list, assuming the first element starts at index 0
     * @return The Node in the desired position
     */
    private Node iterateList(int index)
    {
        //Dummy node to iterate the list --> So we don't change that this.head actually is
        Node dummyNode = this.head;
        //For loop until i is the desired index
        for (int i = 0; i < index; i++)
        {
            //move to the next node
            dummyNode = dummyNode.next;
        }

        //return node at desired index
        return dummyNode;
    }

    /**
     * If no index is specified, then iterateList will iterate the list until the last element
     * @return Return the node at the desired index
     */
    private Node iterateList()
    {
        //Dummy node to iterate the list --> So we don't change that this.head actually is
        Node dummyNode = this.head;
        //If dummyNode.next ever points to null, then it means that we are at the last element of the linked list
        while(dummyNode.next != null)
        {
            //move to the next node
            dummyNode = dummyNode.next;
        }
        //return the last element
        return dummyNode;
    }


    /**
     * Add an element to the top of the linked list
     * @param cargo Cargo of the element that will be added to the top of the Linked list
     */
    public void addFirst(String cargo)
    {
        this.head = new Node(cargo, this.head);   
        this.length++;
    }
    /**
     * Adds an element to the end of the linked list
     * @param cargo String to be held in the LinkedList
     */
    public void addLast(String cargo)
    {
        //Go to the end of the list
        Node dummyNode = iterateList();
        //Change the end of the list to point to a new node, which then points to null
        dummyNode.next = new Node(cargo, null);
        //increase the lenght of the LinkedList by 1
        length++;
    }
    /**
     * Remove the last element of the linked list
     * @return Return the Node of the last element
     */
    public Node removeLast()
    {
        //Go to the end of the last and save the value of the Node to holder variable
        Node holder = iterateList();
        //use a dummyNode to iterate to the second last element in the list
        Node dummyNode = iterateList(length-2);
        //Set the dummyNode to point to null, removing the last element
        dummyNode.next = null;
        //reduce the size of the linkedlist
        this.length--;
        //return the Node that saved the value of the original last Node
        return holder;
        
    }
    /**
     *  Remove the first element of the linked list
     * @return The node of the first element
     */
    public Node removeFirst()
    {
        //Set the dummyNode to point to the head of the LinkedList
        Node dummyNode = this.head;
        //Make the head equal to the next node, removing the original last element
        this.head = this.head.next;
        //decrease the size of the list
        this.length--;
        //return the original first Node
        return dummyNode;
    }


    /*
     * toString method to allow us to print the cargo of a LinkedList easily
     * @return a String that outputs all the cargo in a LinkedList
     */
    public String toString()
    {
        Node curNode = this.head;
        String str = "";
        while (curNode != null)
        {
            str = str + String.format("Cargo: " + curNode.cargo + "\n");
            curNode = curNode.next;
        }
        return str;
    }

    /*
     * A main to test whether or not LinkedList works properly
     */
    public static void main(String[] args)
    {
        LinkedList a = new LinkedList();
        a.addFirst("1");
        a.addFirst("2");
        a.addLast("3");
        a.addFirst("4");
        a.addLast("5");
        a.removeFirst();
        a.removeLast();
        a.addFirst("6");
        a.addLast("7");
        System.out.println(a);
    }
}

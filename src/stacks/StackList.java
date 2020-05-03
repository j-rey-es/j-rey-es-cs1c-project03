package stacks;
import java.util.Iterator;

/**
 * StackList class is a generic Stack ADT
 * @author Joel R
 */

public class StackList <T> implements Iterable<T>{
    private String name;
    private Node top;
    private int size = 0;
    /**
     * Default constructor for StackList
     * Sets name to empty and top to null
     * @param stackName Name of the StackList
     */
    public StackList(String stackName)
    {
        name = stackName;
        top = null;

    }

    /**
     * takes a generic item as the argument and adds the item to the top of the stack.
     * @param x the generic item added to the top of the stack
     **/
    public void push(T x)
    {
        Node<T> newNode = new Node<T>(x,null);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /**
     * Removes the item from the top of the stack
     * @return The generic item from the top of the list
     */

    public T pop()
    {
        if (this.isEmpty())
            return null;
        Node<T> temp;
        temp = top;
        if (top !=null)
        {
            top=top.next;
            temp.next = null;
        }
        size--;
        return temp.data;
    }

    /**
     * Looks at the top of the stack and returns the item without removing it
     * @return The generic for data at the top of the stack
     */
    public T peek()
    {
        if (this.isEmpty())
            return null;
        return (T) top.data;
    }

    /**
     * Removes all references and sets StackList to empty state
     */
    public void clear()
    {
        top = null;
        size = 0;
    }

    /**
     * Returns the StackList as a formatted string containing the name of the stack and the items
     * @return header + showAll A string containing the names and the contents of the StackList
     */
    public String toString(){
        String showAll = "[";
        String header;
        header = name + " with " + this.size() + " links " + "\n" ;
        Node i;
        for(i = top; i!=null; i = i.next)
        {
            showAll += i.toString() +", ";
        }
        return header + showAll + "]";
    }


    /**
     * Checks if stack is empty by checking if top is pointing to anything
     * @return boolean true if stack is empty false if not;
     */
    public boolean isEmpty()
    {
       return top == null;
    }


    /**
     * Returns how many items are in the stack
     * @return Integer, number of items in stack
     */
    public int size()
    {
        return size;
    }

    /**
     * Node inner class of the StackListt that holds the generic data contains pointers to Next object in Node
     * @author Joel R
     */
    private class Node <T>
    {
        T data;
        Node next;
        /**
         * Constructor for Node objects
         * @param obj Generic object defined
         * @param nxt Node object to have obj
         */
        Node (T obj, Node nxt)
        {
            data = obj;
            next = nxt;
        }

        /**
         * Accessor for data
         * @return  The data stored in the Node
         */
        public T getData()
        {
            return data;
        }

        /**
         * Stringizer for the data object
         * @return  The data stored in the Node as a String
         */
        public String toString()
        {
            return data.toString();
        }

    }
    /**
     * Iterator inner class of the StackList that contains a second StackList that allows the client to use Iterator object to navigate StackList
     * @author Joel R
     */
    public Iterator<T> iterator()
    {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        StackList<T> iteratorStack = new StackList<T>("Iterator Stack"); //separate stackList to hold data

        /**
         * Interface for Iterator for hasNext()
         * @return boolean, true if there is a next node in StackList
         */
        public boolean hasNext() {
            if (StackList.this.isEmpty())
                return false;
            return top.next !=null;
        }

        /**
         * Interface for Iterator for next()
         * @return generic data for data stored in Next node
         */
        public T next() {
            T tempData;
            tempData = StackList.this.pop();
            iteratorStack.push(tempData);
            return tempData;
        }

        /**
         * Method is not used in this project
         */
        public void remove()
        {

        }
    }
}

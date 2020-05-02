package stacks;

import java.util.Iterator;

public class StackList <T>{
    private String name;
    private Node top;

    /**
     * Default constructor for StackList
     * Sets name to empty and top to null
     */
    public StackList()
    {
        name = "Empty";
        top = null;
    }

    /**
     * takes a generic item as the argument and adds the item to the top of the stack.
     *
     * @param x the generic item added to the top of the stack
     * @return Returns true if generic object is added successfully
     **/
    public boolean push(T x)
    {
        return true;
    }

    /**
     * Removes the item from the top of the stack. This method should return the generic item popped
     *
     * @return The generic item from the top of the list
     */



    public T pop()
    {
        return T;
    }

    /**
     * Looks at the top of the stack and returns a generic type for the data seen at the top of the stack.
     * The item should not be removed from the top of the stack.
     * NOTE: If the stack is empty, returns null.
     * @return The generic for data at the top of the stack
     */
    public T peek()
    {
        return T;
    }

    /**
     * Discards all object references from the linked-list to "empty" this StackList instance.
     *
     */
    public void clear()
    {

    }

    public String toString(){
        return String;
    }


    /**
     * Checks if stack is empty by checking if top is pointing to anything
     * @return boolean true if stack is empty false if not;
     */
    public boolean isEmpty()
    {
        if (top.next == null)
            return true;
        else
            return false;
    }


    /**
     * Returns how many items are in the stack
     * @return Integer, number of items in stack
     */
    public int size()
    {
        int size = 0;
        return size;
    }







    private class Node <T>
    {
        T data;
        Node next;

    }


    private class StackIterator implements Iterator<T> {

        public boolean hasNext() {
            return false;
        }


        public T next() {
            return null;
        }
    }
}

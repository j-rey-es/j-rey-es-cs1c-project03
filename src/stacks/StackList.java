package stacks;


import java.util.Iterator;

public class StackList <T> implements Iterable<T>{
    private String name;
    private Node top;
    private int size = 0;
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
     *
     **/
    public void push(T x)
    {
        Node<T> newNode = new Node<T>(x,null);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /**
     * Removes the item from the top of the stack. This method should return the generic item popped
     *
     * @return The generic item from the top of the list
     */

    public T pop()
    {
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
     * Looks at the top of the stack and returns a generic type for the data seen at the top of the stack.
     * The item should not be removed from the top of the stack.
     * NOTE: If the stack is empty, returns null.
     * @return The generic for data at the top of the stack
     */
    public T peek()
    {
        if (this.isEmpty())
            return null;
        return (T) top.data;
    }

    /**
     * Discards all object references from the linked-list to "empty" this StackList instance.
     *
     */
    public void clear()
    {
        top = null;
        size = 0;
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

    private class Node <T>
    {
        T data;
        Node next;

        Node (T obj, Node nxt)
        {
            data = obj;
            next = nxt;
        }

        public T getData()
        {
            return data;
        }

    }

    public Iterator<T> iterator()
    {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        StackList<T> iteratorStack = new StackList<T>(); //separate stackList to hold data

        public boolean hasNext() {
            return top.next != null;
        }


        public T next() {
            T tempData;
            tempData = StackList.this.pop();
            iteratorStack.push(tempData);
            return tempData;
        }

        public void remove()
        {

        }
    }
}

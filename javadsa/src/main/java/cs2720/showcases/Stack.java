package cs2720.showcases;

/**
 * A collection of objects that are inserted and removed according to the 
 * last-in first-out principle. Interface differs from java.util.stack.
 */
public interface Stack<E> {
    
    /**
     * Returns the number of elements in the stack.
     * @return
     */
    int size();
    
    /**
     * Tests whether the stack is empty.
     * @return
     */
    boolean isEmpty();
    
    /**
     * Inserts an element at the top of the stack.
     * @return
     */
    void push(E e);
    
    /**
     * Returns, but does not remove, the element at the top of the stack.
     * @return
     */
    E top();

    /**
     * Removes and returns the top element from the stack.
     * @return
     */
    E pop();    
} // Stack
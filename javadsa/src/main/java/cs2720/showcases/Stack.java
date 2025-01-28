package cs2720.showcases;

/**
 * A collection of objects that are inserted and removed according to the
 * last-in first-out principle. Interface differs from java.util.stack.
 */
public interface Stack<E> {

    /**
     * Returns the number of elements in the stack.
     * 
     * @return number of elements in the stack.
     */
    int size();

    /**
     * Tests whether the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Inserts an element at the top of the stack.
     * 
     * @return e the element to be inserted.
     */
    void push(E e);

    /**
     * Returns, but does not remove, the element at the top of the stack.
     * 
     * @return top element in the stack (null if empty)
     */
    E top();

    /**
     * Removes and returns the top element from the stack.
     * 
     * @return element removed (null if empty)
     */
    E pop();
} // Stack
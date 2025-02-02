package cs2720.showcases;

/**
 * Class is designed from the Adapter Design Pattern, its meant to bridge the gap between
 * the Stack interface + the SinglyLinkedList interface. The end goal is to have a class 
 * which holds the same Singly Linked List data structure but we want to incorporate
 * some logic so it can also act as a Stack Data Structure.
 */
public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public LinkedStack() { 
        // initial empty linked list.
    } // LinkedStack
    
    public int size() { 
        return list.size();
    } // size

    public boolean isEmpty() {
        return list.isEmpty();
    } // isEmpty

    public void push (E element) { 
        list.addNodeFirst(element);
    } // push

    public E top() { 
        return list.first();
    } // top

    public E pop() { 
        return list.removeFirst();
    } // pop
} // LinkedStack
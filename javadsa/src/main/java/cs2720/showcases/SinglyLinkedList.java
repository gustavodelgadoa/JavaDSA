package cs2720.showcases;

public class SinglyLinkedList<E> {
    /** Nested Node class */
    private static class Node<E> { 
        private E element;
        private Node<E> next;
        
        public Node(E e, Node<E> n) { 
            element = e;
            next = n;
        } // Node Constructor
        
        public E getElement() { 
            return element;
        } // getElement
        
        public Node<E> getNext() { 
            return next;
        } // getNext

        public void setNext(Node<E> n) { 
            next = n;
        } // setNext
    } // Node

    // Instance Variables 
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList() { } // constructs initial empty list.

    // Access methods
    public int size() { 
        return size;
    } // size

    public boolean isEmpty() { 
        return size == 0;
    } // isEmpty

    public E first() { 
        if (isEmpty()) { 
            return null;
        }
        return head.getElement();
    } // first

    
    public E last() { 
        if (isEmpty()) { 
            return null;
        }
        return tail.getElement();
    } // last

    // Update methods
    public void addNodeFirst(E e) { 
        head = new Node<>(e, head);
        if (size == 0) { 
            tail = head;
        } // if
        size++;
    } // addNodeFirst

    public void addNodeLast(E e) { 
        Node<E> newest = new Node<>(e, null); 
        if (isEmpty()) { 
            head = newest;
        } else { 
            tail.setNext(newest);    
        } // if-else
        tail = newest;
        size++;
    } // addNodeLast

    public E removeFirst() { 
        if (isEmpty()) { 
            return null;
        } // if
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) { 
            tail = null;
        } // if
        return answer;
    } // removeFirst    
} // SinglyLinkedList
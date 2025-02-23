package cs2720.showcases;

public class ArrayStack<E> implements Stack<E> { 
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    
    public ArrayStack() {
        this(CAPACITY);
    } // ArrayStack

    @SuppressWarnings("unchecked")
    public ArrayStack(int CAPACITY) { 
        data = (E[]) new Object[CAPACITY];
    } // ArrayStack

    public int size() {
        return (t+1);
    } // size

    public boolean isEmpty() {
        return (t==-1);
    } // isEmpty

    public void push(E e) throws IllegalStateException { 
        if (size() == data.length) { 
            throw new IllegalStateException("Stack is full");
        } // if
        data[++t] = e;
    } // push

    public E top() { 
        if (isEmpty()) { 
            return null;
        } // if
        return data[t];
    } // top

    public E pop() { 
        if (isEmpty()) { 
            return null;
        } // if
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    } // pop
} // ArrayStack
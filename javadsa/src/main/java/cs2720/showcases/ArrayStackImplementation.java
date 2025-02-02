package cs2720.showcases;

public class ArrayStackImplementation { 
    
    public static void main(String[] args) { 
        Stack<Integer> S = new ArrayStack<>();
        System.out.println("ArrayStackImplementation works");
        S.push(5);
        S.push(10);
        System.out.println("The size of the array stack is: " + S.size());
        S.pop();
        System.out.println("After pop, The size of the array is: " + S.size());
    } // main
    
}
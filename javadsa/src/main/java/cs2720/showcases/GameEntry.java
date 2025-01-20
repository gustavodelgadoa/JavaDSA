package cs2720.showcases;
import java.util.Scanner;

public class GameEntry { 
    private String name;
    private int score;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("GameEntry is executing...");
        System.out.print("Enter the Players name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the Players score: ");
        int score = scanner.nextInt();

        GameEntry entry = new GameEntry(name, score);
        System.out.println(entry);
        scanner.close();
    } // main

    /** 
     * Constructor
     */
    public GameEntry (String n, int s) { 
        name = n;
        score = s;
    } // GameEntry

    // Method returns name
    public String getName () {
        return name;
    } // getName

    // Method returns score
    public int getScore () { 
        return score;
    } // getScore

    // Method returns string representation of entry.
    public String toString () { 
        return "Name: " + name + " Score: " + score;
    } // toString
}
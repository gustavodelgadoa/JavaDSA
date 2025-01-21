package cs2720.showcases;

/**
 * This file marks the first file created for this repo.
 *
 */
public class Scoreboard {

    public static void main(String[] args) {
        System.out.println("Hello Universe!");
    } // main

    private int numEntries = 0; // number of entries
    private GameEntry[] board; // array of game entries (name , score)

    // Constructs empty scoreboard with given capicity for storing entries
    public Scoreboard(int capacity) { 
        board = new GameEntry[capacity];
    } // Scoreboard

    // Method to attempt to add new score to array if high enough
    public void add(GameEntry entry) { 
        int newScore = entry.getScore();
        // Test to see if score is high enough
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) { 
            if (numEntries < board.length) { 
                numEntries++;
            } // inner if
            // shifts any lower scores rightward to make room for new entry
            int j = numEntries - 1;
            while (j > 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1]; // shifts entry from j-1 to j
                j--; 
            } // while
            board[j] = entry; // when done, adds entry
        } // outer if
    } // add

    // Method removes and returns the high score at index i.
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) { 
            throw new IndexOutOfBoundsException("Invalid Index: " + i);
        } // if
        GameEntry tempEntry = board[i];
        for (int j = i; j < numEntries - 1; j++) { 
            board[j] = board[j + 1];
        } // for
        board[numEntries - 1] = null;
        numEntries--;
        return tempEntry;
    } // remove





} // Scoreboard

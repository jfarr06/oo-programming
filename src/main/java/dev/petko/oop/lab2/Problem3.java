/**
 * @file Problem3.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab2;

/**
 * Main entrypoint for problem 3.
 *
 * Testing methods.
 */
public class Problem3
{
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) 
    {
        var song = new SongEncapsulated("SongName", "That one guy", 25);
        
        song.playSample();
    }
}

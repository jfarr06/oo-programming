/**
 * @file Problem1.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab2;

/**
 * Main entrypoint for problem 1.
 *
 * Class with no encapsulation.
 */
public class Problem1 
{
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) 
    {
        var song = new Song("SongName", "That one guy", 25);

        System.out.println(song);
        System.out.println(song.songTitle);
    }
}

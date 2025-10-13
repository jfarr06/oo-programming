/**
 * @file Problem2.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab2;

/**
 * Main entrypoint for problem 2.
 *
 * Class with encapsulation and validation.
 */
public class Problem2 {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var song = new SongEncapsulated("SongName", "That one guy", 25);

        System.out.println(song.getSongTitle());
        System.out.println(song.getArtist());
        System.out.println(song.getDurationSeconds());

        System.out.println(song);

        try {
            song.setDurationSeconds(1);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
}

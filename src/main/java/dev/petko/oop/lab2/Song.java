/**
 * @file Song.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab2;

/**
 * Base song class.
 */
public class Song 
{
    /**
     * The song title
     */
    public String songTitle;

    /**
     * The song artist
     */
    public String artist;
    
    /**
     * The song duration in seconds
     */
    public int durationSeconds;

    /**
     * Construct a new instance of {@link Song}
     *
     * @param songTitle The title of the song
     * @param artist The artist of the song
     * @param durationSeconds The duration of the song in seconds.
     */
    public Song(String songTitle, String artist, int durationSeconds)
    {
        this.songTitle = songTitle;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    /**
     * {@inheritDoc Object::toString}
     */
    public String toString()
    {
        return String.format("This song is called %s, performed by %s, and lasts %d seconds.", songTitle, artist, durationSeconds);
    }
}

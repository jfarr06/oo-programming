/**
 * @file SongEncapsulated.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab2;

/**
 * Song class with encapsulation.
 */
public class SongEncapsulated
{
    private String songTitle;
    private String artist;
    private int durationSeconds;

    /**
     * Construct a new instance of {@link Song}
     *
     * @param songTitle The title of the song
     * @param artist The artist of the song
     * @param durationSeconds The duration of the song in seconds.
     * @exception IllegalArgumentException Song duration must be more than 6s and less than 60s"
     */
    public SongEncapsulated(String songTitle, String artist, int durationSeconds)
    {
        setSongTitle(songTitle);
        setArtist(artist);
        setDurationSeconds(durationSeconds);
    }

    /**
     * Get the song title
     *
     * @return The song title.
     */
    public String getSongTitle() 
    {
        return songTitle;
    }

    /**
     * Sets the song title.
     *
     * @param songTitle The song title
     */
    public void setSongTitle(String songTitle) 
    {
        this.songTitle = songTitle;
    }

    /**
     * Get the artist
     *
     * @return The artist.
     */
    public String getArtist() 
    {
        return artist;
    }

    /**
     * Sets the artist.
     *
     * @param artist The artist
     */
    public void setArtist(String artist) 
    {
        this.artist = artist;
    }

    /**
     * Get the duration in seconds.
     *
     * @return The duration in seconds.
     */
    public int getDurationSeconds() 
    {
        return durationSeconds;
    }

    /**
     * Sets the duration in seconds.
     *
     * @param durationSeconds The duration in seconds.
     * @exception IllegalArgumentException Song duration must be more than 6s and less than 60s
     */
    public void setDurationSeconds(int durationSeconds) 
    {
        if (durationSeconds < 6 || durationSeconds > 60)
            throw new IllegalArgumentException("Song duration must be more than 6s and less than 60s");

        this.durationSeconds = durationSeconds;
    }

    /**
     * Prints a sample.
     */
    public void playSample() 
    {
        System.out.printf("Playing a sample of %s music...\n", getArtist());
    }

    /**
     * {@inheritDoc Object::toString}
     */
    @Override
    public String toString()
    {
        return String.format("This song is called %s, performed by %s, and lasts %d seconds.", getSongTitle(), getArtist(), getDurationSeconds());
    }
}

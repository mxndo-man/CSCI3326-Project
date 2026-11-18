package musicLib;

/**
 * Base class for any playable song in the music library.
 *
 * 
 * A {@code Track} holds the metadata that every song has, no matter where
 * it comes from: an ID, a song name and an author. Subclasses such as
 * {@link localFile}(local MP3s) and {@link spotifyTrack} decide how the song
 * actually plays by
 * implementing {@link #play()}, {@link #pause()} and {@link #stop()}.
 *
 * The class also counts how many {@code Track} instances have been
 * created, using a static counter shared by all subclasses
 * (see {@link #getCounter()}).
 *
 * @see Library
 */
public abstract class Track {
  private final String songId;
  private final String songName;
  private final String author;
  private static int counter = 0;

  protected Track(String songId, String songName, String author) {
    this.songId = songId;
    this.songName = songName;
    this.author = author;
    counter++;
  }

  public abstract void play();

  public abstract void pause();

  public abstract void stop();

  public String getId() {
    return this.songId;
  }

  public String getName() {
    return this.songName;
  }

  public String getAuthor() {
    return this.author;
  }

  public static int getCounter() {
    return counter;
  }

  @Override
  public String toString() {
    // If mp3 cannot get songname, author name
    return this.songName + " - " + this.author;
  }
}

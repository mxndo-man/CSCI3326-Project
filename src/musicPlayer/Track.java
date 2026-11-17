package musicPlayer;

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
    return this.getAuthor();
  }

  public int getCounter() {
    return this.counter;
  }

  @Override
  public String toString() {
    // If mp3 cannot get songname, author name
    return this.songName + " - " + this.author;
  }
}

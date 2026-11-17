import musicLib.Library;

public class Player {
  private final Library library;
  private Track current;

  public Player(Library library){
    this.library = library;
  }

  

  public void onSourcesChanged() {
    List<Track> tracks = library.allTracks();

    if (current != null && !tracks.contains(current)) {
      current.stop(); // Spotify songs call PUT /me/player/pause here
      current = null;
    }

    if (tracks.isEmpty()) {
      return;
    }

    if (current == null) {
      skip(); 
    }

  }
}

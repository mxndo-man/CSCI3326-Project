package musicLib;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class localSongs implements MusicSource {
  private final List<Track> files = new ArrayList<>();
  private boolean enable = true;

  @Override 
  public void addFile(File mp3){ files.add(new localFile(mp3));} // adding a file"mp3" to the list

  @Override 
  public List<Track> getTracks(){ // List of tracks 
    return this.files;
  }

  @Override 
  public boolean isAvailable(){ // With an mp3 player the music will always be avaible.
    return true;
  }

  @Override
  public void setEnabled(boolean enable){
    this.enable=enable;
  }


}

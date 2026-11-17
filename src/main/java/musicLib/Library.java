package musicLib;

import java.util.ArrayList;
import java.util.List;

import musicLib.MusicSource;
import musicLib.Track;

public class Library {
  private final List<MusicSource> sources = new ArrayList<>();

  public void addSources(MusicSource s){
    if (!sources.contains(s)){ // stop duplicates from being added
      sources.add(s);
    }
  }

  public void deleteSong(MusicSource s){
    if (sources.contains(s)){
      sources.remove(s);
    }
  }

  public List<Track> combineTracks(){
    List<Track> result = new ArrayList<>();
    for(MusicSource i : sources){
      if(i.isAvailable() && i.setEnabled()){
        result.addAll(i.getTracks());
      }
    }

    return result;
  }

  public boolean isEmpty(){
    return sources.isEmpty(); //Will be used for the skip feature.
  }
  
}

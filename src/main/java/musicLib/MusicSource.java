package musicLib;


import java.util.List;

public interface MusicSource {

  List<Track> getTracks(); // List of tracks

  boolean isAvailable(); // Determine if the song is aviavable, also if next

  void setEnabled(boolean enable); //Checking if the user wants mp3 or spotify 
}

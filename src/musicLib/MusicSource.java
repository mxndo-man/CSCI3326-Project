package musicLib;

public interface MusicSource {

  List<Track> getTracks();

  boolean isAvailable();
}

package musicLib;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

import musicLib.Track;

public class localFile extends Track {
  private MediaPlayer musicPlayer;
  private final File file;

  public localFile(File file) {
    super(file.getAbsoluteFile(), file.getName().replace(".mp3", ""), "Unknown Artist");
    this.file = file;
  }

  @Override
  public void pause() {
    if (musicPlayer != null) {
      musicPlayer.dispose();
    }
  }

  @Override
  public void play() {

  }

}

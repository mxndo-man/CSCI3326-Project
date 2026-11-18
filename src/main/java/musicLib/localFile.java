package musicLib;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class localFile extends Track {
  private MediaPlayer musicPlayer;
  private final File file;

  public localFile(File file) {
    // Constructor inorder to implement the approriate names for the song file.
    super(file.getAbsolutePath(), file.getName().replace(".mp3", ""), "Unknown Artist");
    this.file = file;
  }

  @Override
  public void pause() {
    // Simply pauses the file
    if (musicPlayer != null) {
      musicPlayer.pause();
    }
  }

  @Override
  public void play() {
    // If null then find the path to the file inorder to play it.
    if (musicPlayer == null) {
      musicPlayer = new MediaPlayer(new Media(file.toURI().toString()));
    }
    musicPlayer.play();

  }

  @Override
  public void stop() {
    if (musicPlayer != null) {
      musicPlayer.stop();
      // To clear up memory of the track
      musicPlayer.dispose();
      musicPlayer = null;
    }
  }

}

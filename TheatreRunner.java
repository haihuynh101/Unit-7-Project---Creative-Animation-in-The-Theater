import org.code.theater.*;
import org.code.media.*;

// This is the main runner class to start and play the animation
public class TheaterRunner {
  public static void main(String[] args) {

    // Create the first image object with file "kidwalking.jpg"
    // Positioned at X = 0, Y = 100
    SceneImage example = new SceneImage("kidwalking.jpg", 0, 100);

    // Create the second image object with file "shooting.jpg"
    // Positioned at X = 0, Y = 50
    SceneImage secondImage = new SceneImage("shooting.jpg", 0, 50);

    // Create a custom scene using MyScene class with the two images
    MyScene scene = new MyScene(example, secondImage);

    // Draw and animate the scene
    scene.drawScene();

    // Play the scene using Theater
    Theater.playScenes(scene);
  }
}
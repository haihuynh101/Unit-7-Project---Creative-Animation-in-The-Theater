import org.code.theater.*;
import org.code.media.*;

// Class that extends Scene to create a custom animation
public class MyScene extends Scene {
  // Array to store images used in the scene
  private SceneImage[] images;
  // Array to store the horizontal positions of the images
  private int[] xPositions;

  // Constructor that initializes the image array and their X positions
  public MyScene(SceneImage img1, SceneImage img2) {
    images = new SceneImage[] { img1, img2 };
    xPositions = new int[] { img1.getX(), img2.getX() };
  }

  // Main method that draws the full animation sequence
  public void drawScene() {
    animateWalking();  // First part: walking animation
    animateShooting(); // Second part: shooting and zoom-in
  }

  // === PRIVATE helper methods for organization ===

  // Draws title text on screen with customizable Y position
  private void drawTitleText(String text, int y) {
    setTextHeight(20);
    setTextColor("black");
    setTextStyle(Font.MONO, FontStyle.BOLD);
    drawText(text.toUpperCase(), 35, y); // Draws text in uppercase at X=35, Y=y
  }

  // Overloaded method to draw title text with a default Y position of 45
  private void drawTitleText(String text) {
    drawTitleText(text, 45);
  }

  // Animation 1: Moves the first image across the screen to simulate walking
  private void animateWalking() {
    int size = 400; // Image size

    // Continue animation until the image reaches X position 400
    while (xPositions[0] < 400) {
      clear("white"); // Clears the screen with a white background

      drawTitleText("Freshman Jonny Going to Hoop"); // Draw title text

      // Draw the walking image at the current X position
      drawImage(images[0].getFileName(), xPositions[0], images[0].getY(), size);
      xPositions[0] += 67; // Move the image to the right

      // Play walking sound effect
      playSound("walking-on-concrete-ver-2-268513-(1).wav");

      pause(1.0); // Pause to control animation speed
    }
  }

  // Animation 2: Simulates zooming in on the second image to show a shooting scene
  private void animateShooting() {
    int size = 400; // Initial size of the image

    // Gradually reduce the image size to create a zoom-in effect
    while (size > 100) {
      clear("white"); // Clears the screen

      drawTitleText("Freshman Jonny is at the park"); // Draw title text

      // Draw the image at the current size
      drawImage(images[1].getFileName(), xPositions[1], images[1].getY(), size);
      size -= 10; // Shrink the image each frame

      pause(0.1); // Small pause for smoother animation
    }
  }
}
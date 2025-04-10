/**
 * Represents a image drawn in the Scene
 */
public class SceneImage {

  private String fileName;
  private int x;
  private int y;

  public SceneImage(String fileName, int x, int y) {
    this.fileName = fileName;
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String getFileName() {
    return fileName;
  }

  public void setX(int newX) {
    x = newX;
  }

  public void setY(int newY) {
    y = newY;
  }
  
  public void setFile(String newFileName) {
    fileName = newFileName;
  }

}
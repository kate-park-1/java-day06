package ex6.chapter10.sec01;

public class Rectangle implements Comparable{
  private int width, height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }
  @Override
  public String toString() {
    return String.format("사각형[너비=%d, 높이=%d]", width, height);
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}

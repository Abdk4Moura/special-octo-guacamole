
/**
 * @author : agboola
* @created : 2023-03-14
 **/

import LearnJavaClasses;

public class MyClasses {
  public static void main(String[] args) {

    // LearnJavaClasses
    System.out.println("First starting out with `LearnJavaClasses`");
  }
}

class OverloadingExample {
  public static void main() {
  }
}

class DataArtist {
  private int rating;
  private String name;
  private int schoolRank;

  public DataArtist(String name, int rating, int schoolRank) {
    this.name = name;
    this.rating = rating;
    this.schoolRank = schoolRank;
  }

  public void draw(String s) {
    // do something
  }

  public void draw(int i) {
    // do something
  }

  public void draw(double f) {
    // do something
  }

  public void draw(int i, double f) {
    // do something
  }
}

class Bicycle {

  private int cadence;
  private int gear;
  private int speed;

  private int id;

  private static int numberOfBicycles = 0;

  public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;

    id = ++numberOfBicycles;
  }

  public int getID() {
    return id;
  }

  public static int getNumberOfBicycles() {
    return numberOfBicycles;
  }

  public int getCadence() {
    return cadence;
  }

  public void setCadence(int newValue) {
    cadence = newValue;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int newValue) {
    gear = newValue;
  }

  public int getSpeed() {
    return speed;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void speedUp(int increment) {
    speed += increment;
  }
}

class Polygon {
  public Point[] corners;

  // public Polygon(Point[] corners) {

  // }
  /* Using variable args */
  public Polygon(Point... corners_) {
    corners = java.util.Arrays.copyOfRange(corners_, 0, corners_.length - 1);
  }
}

class Circle {
  private Point o;
  int radius;

  public void setOrigin(int x, int y) {
    //
  }
}

class Point {
  public double x;
  public double y;

  public Point(double x_, double y_) {
    x = x_;
    y = y_;
  }

  public Point(double length, float angleInRads) {
    if (length == 0)
      x = 0;
    x = Math.cos(angleInRads);
    y = Math.sin(angleInRads);

    this(x, y);
  }
}

class Line {
  public Point a;
  public Point b;

  public Line(Point a_, Point b_) {
    a = a_;
    b = b_;
  }

  public Line fromRadialCoordinate(double length, float angleInRads) {
    a = Point(0, 0);
    b = Point.fromRadialCoordinate(length, angleInRads);
  }

  public double getLength() {
    double x_length = b.x - a.x;
    double y_length = b.y - a.y;

    return Math.sqrt(x_length * x_length + y_length * y_length);
  }
}

class Utils {
  public static double length(Point a, Point b) {
    double span_x = b.x - a.x, span_y = b.y - a.y;
    return Math.sqrt(span_x * span_x + span_y * span_y);
  }
}

class Rectangle {
  private Point[] points;
  public double width, height;

  public Rectangle(Point... points) {
    if (points_.length > 4)
      throw Exception();

    adjustValue(points);
  }

  public Rectangle(double width, double height) {
    double h_w = width / 2, h_h = height / 2;
    Point a = Point(-h_w, -h_h), b = Point(-h_w, h_h), c = Point(h_w, h_h), d = Point(h_w, -h_h);

    Point[] points_ = { a, b, c, d };

    this(points);
  }

  private void adjustValue(Point[] points) {
    this.points = java.util.Arrays.copyOfRange(points, 0, points.length);
    Point a = points[0], b = points[1], c = points[2], d = points[3];

    width = Utils.length(a, d);
    height = Utils.length(a, b);
  }

  private void moveProto(double px, double py) {
    int i = 0;
    for (Point p : points) {
      points[i] = p.x + px;
      points[i++] = p.y = py;
    }
  }

  public void move(Point point) {
    double px = p.x, py = p.y;

    moveProto(px, py);
    adjustValue(points);
  }

  public void move(double px, double py) {
    moveProto(px, py);
    adjustValue(points);
  }

  public double getArea() {
    return width * height;
  }
}

class CreateObjectDemo {

  public static void main() {

    // Declare and create a point object and two rectangle objects.
    Point originOne = new Point(23, 94);
    Rectangle rectOne = new Rectangle(originOne, 100, 200);
    Rectangle rectTwo = new Rectangle(50, 100);

    // display rectOne's width, height, and area
    System.out.println("Width of rectOne: " + rectOne.width);
    System.out.println("Height of rectOne: " + rectOne.height);
    System.out.println("Area of rectOne: " + rectOne.getArea());

    // set rectTwo's position
    rectTwo.origin = originOne;

    // display rectTwo's position
    System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
    System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

    // move rectTwo and display its new position
    rectTwo.move(40, 72);
    System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
    System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
  }
}

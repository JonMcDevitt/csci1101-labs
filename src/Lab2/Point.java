package Lab2;

/**
 * Created by Owner on 1/23/2017.
 */
public class Point {
    private int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public int getX() {
        return xPos;
    }

    public void setX(int xPos) {
        this.xPos = xPos;
    }

    public int getY() {
        return yPos;
    }

    public void setY(int yPos) {
        this.yPos = yPos;
    }

    public boolean equals(Point p) {
        return this.xPos == p.getX() && this.yPos == p.getY();
    }

    public boolean isHigher(Point p) {
        return !this.equals(p) && this.yPos < p.getY();
    }

    public double findDistance(Point p) {
        return Math.sqrt(Math.abs(Math.pow((p.getX() - xPos), 2) + Math.pow((p.getY() - yPos), 2)));
    }

    public String toString() {
        return "[" + xPos + ", " + yPos + "]";
    }
}

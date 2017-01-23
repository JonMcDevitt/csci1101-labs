package Lab2;

import java.util.Scanner;

/**
 * Created by Owner on 1/23/2017.
 */
public class PointDemo {
    public static void main(String[] args) {
        int x, y;

        Scanner in = new Scanner(System.in);
        Point[] points = new Point[4];

        for(Point p : points) {
            System.out.println("Enter the x and y coordinates of a point: ");
            x = in.nextInt();
            y = in.nextInt();
            p = new Point(x, y);
        }

        findHighest(points);
        findDistance(points[0], points[1]);
        findDistance(points[2], points[3]);

        if(points[0].findDistance(points[1]) > points[2].findDistance(points[3])) {
            System.out.println("[" + points[0] + "] --> [" + points[1] + "] is longer than [" + points[2] + "] --> [" + points[3] + "]");
        } else if(points[0].findDistance(points[1]) < points[2].findDistance(points[3])) {
            System.out.println("[" + points[2] + "] --> [" + points[3] + "] is longer than [" + points[0] + "] --> [" + points[1] + "]");
        } else {
            System.out.println("Both lines are equal in length.");
        }
    }

    public static void findHighest(Point[] points) {
        /** Assume first point is highest   */
        Point p = points[0];

        for(int i = 1; i < points.length; i++) {
            if(points[i].isHigher(p)) {
                p = points[i];
            }
        }

        System.out.println("Highest point is " + p);
    }

    public static void findDistance(Point p1, Point p2) {
        System.out.println("The distance between " + p1 + " and " + p2 + " is "
                + (p1.isHigher(p2) ? p2.findDistance(p1) : p1.findDistance(p2)));
    }
}

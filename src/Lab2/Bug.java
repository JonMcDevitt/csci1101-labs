package Lab2;

import java.util.Random;
import java.util.function.Consumer;

/**
 * Created by Owner on 1/23/2017.
 */
public class Bug {
    private enum Direction {
        LEFT,
        RIGHT
    }
    private int position;           /** Stores the bug's x-position */
    private Direction direction;    /** Stores the bug's direction  */

    public Bug() {
        Random rand = new Random();
        position = rand.nextInt(51);
        int dir = rand.nextInt(2);
        if(dir == 0) {
            direction = Direction.LEFT;
        } else {
            direction = Direction.RIGHT;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    /**
     *  Move
     *      1.  Generate random number of steps to move */
    public void move() {
        Random rand = new Random();
        int steps = rand.nextInt(51);
        for(int i = 0; i < steps; i++) {
            switch(position) {
                case 0:
                    direction = Direction.RIGHT;
                    break;
                case 50:
                    direction = Direction.LEFT;
                    break;
                default:
                    break;
            }
            switch(direction) {
                case LEFT:
                    position--;
                    break;
                default:
                    position++;
                    break;
            }
        }
    }

    public String toString() {
        return "Position: " + position + "\nDirection: " + direction;
    }

    public void main(String[] args) {
        Bug bug = new Bug();
        System.out.println(bug);

        print(bug1 -> {
            printPos(bug1);
        });

        bug.move();

        print(bug1 -> {
            printPos(bug1);
        });
    }

    public void print(Consumer<Bug> bugConsumer) {
        bugConsumer.accept(this);
    }

    public void printPos(Bug bug1) {
        for(int i = 0; i < 51; i++) {
            if(bug1.getPosition() == i) {
                System.out.print("X");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}

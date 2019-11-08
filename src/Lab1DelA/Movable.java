package Lab1DelA;

/**
 * An interface for objects that need to be able to move and turn
 */
public interface Movable {
    /**
     * Moves the object forward, the direction it is facing
     */
    void move();

    /**
     * Turns the object counter-clockwise
     */
    void turnLeft();

    /**
     * Turns the objects clockwise
     */
    void turnRight();
}

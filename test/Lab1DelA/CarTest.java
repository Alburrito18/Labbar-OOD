package Lab1DelA;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Volvo240 volvo240 = new Volvo240();
    Saab95 saab95 = new Saab95();

    @Test
    public void gas() {
        volvo240.stopEngine();
        volvo240.gas(-1);
        double slow = volvo240.getCurrentSpeed();
        assertFalse(slow<0);
        volvo240.gas(0.5);
        double fast = volvo240.getCurrentSpeed();
        assertTrue(slow<=fast);
    }

    @Test
    public void incrementSpeed() {
        saab95.stopEngine();
        double slow = saab95.getCurrentSpeed();
        saab95.gas(0.8);
        double fast = saab95.getCurrentSpeed();
        assertTrue(slow<fast);
    }

    @Test
    public void brake() {
        saab95.gas(1);
        saab95.brake(-1);
        double fast = saab95.getCurrentSpeed();
        assertFalse(fast>60);
        saab95.brake(0.5);
        double slow = saab95.getCurrentSpeed();
        assertTrue(slow<fast);
    }

    @Test
    public void decrementSpeed() {
        saab95.gas(1);
        double fast = saab95.getCurrentSpeed();
        saab95.brake(0.8);
        double slow = saab95.getCurrentSpeed();
        assertTrue(slow<fast);
    }

    @Test
    public void move() {
        saab95.gas(1);
        saab95.move();

        assertTrue(saab95.getPositionY()>0 && saab95.getPositionX()==0);
    }

    @Test
    public void turnLeft() {
        saab95.turnLeft();
        assertEquals(-90, saab95.getCourse(), 0.0);
    }

    @Test
    public void turnRight() {
        saab95.turnRight();
        assertEquals(90, saab95.getCourse(), 0.0);
    }

    @Test
    public void stopEngine(){
        saab95.stopEngine();
        assertEquals(0, saab95.getCurrentSpeed(), 0.0);
    }

    @Test
    public void startEngine(){
        saab95.startEngine();
        assertEquals(0.1,saab95.getCurrentSpeed(),0.001);
    }
}
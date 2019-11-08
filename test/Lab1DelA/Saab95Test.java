package Lab1DelA;

import org.junit.Test;

import static org.junit.Assert.*;

public class Saab95Test {
    Saab95 saab95 = new Saab95();
    @Test
    public void setTurboOn() {
        saab95.setTurboOn();
        assertTrue(saab95.isTurboOn());
    }

    @Test
    public void setTurboOff() {
        saab95.setTurboOff();
        assertFalse(saab95.isTurboOn());
    }

    @Test
    public void speedFactor() {
    saab95.setTurboOn();
    double speedfactor1 = saab95.speedFactor();
    saab95.setTurboOff();
    double speedfactor2 = saab95.speedFactor();
    assertTrue(speedfactor1 > speedfactor2);
    }

}
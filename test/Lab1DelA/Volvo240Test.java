package Lab1DelA;

import org.junit.Test;

import static org.junit.Assert.*;

public class Volvo240Test {
    Volvo240 volvo240 = new Volvo240();
    @Test
    public void speedFactor() {
        double speed1 = volvo240.getCurrentSpeed();
        double speed2 = volvo240.getCurrentSpeed() + volvo240.speedFactor();

        assertTrue(speed1<speed2);
    }
}
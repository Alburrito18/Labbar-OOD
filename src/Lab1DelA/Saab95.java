package Lab1DelA;

import java.awt.*;

/**
 * A class representing the car model Saab95, an extension of the class car
 */
public class Saab95 extends Car{

    private boolean turboOn;

    /**
     * Constructor for the class, same as its superclass
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95");
    }

    /**
     * Turns on the turbo of the car
     */
    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Turns off the turbo of the car
     */
    public void setTurboOff(){
	    turboOn = false;
    }
    /**
     * How many percent the car will increase or decrease its speed
     * @return a double representing a percentage
     */
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public boolean isTurboOn() {
        return turboOn;
    }
}

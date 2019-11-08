package Lab1DelA;

import java.awt.*;

/**
 * A class representing the car model Volvo 240, an extension of the class Car
 */
public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    /**
     * Constructor for the class, same as its superclass
     */
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
    }

    /**
     * How many percent the car will increase or decrease its speed
     * @return a double representing a percentage
     */
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }


}

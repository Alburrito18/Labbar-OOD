package Lab1DelA;

import java.awt.*;

/**
 * Class car decribing a generic car
 */
public abstract class Car implements Movable{

    private final int nrDoors;
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private String modelName;
    private double positionX;
    private double positionY;
    private double course;

    /**
     * Constructor for the class car
     * @param nrDoors the number of doors the car will have
     * @param enginePower the max power the engine of the car will produce (bhp)
     * @param color the color of the car
     * @param modelName the model of the car
     */

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();
    }


    public double getEnginePower(){
        return enginePower;
    }

    /**
     * Sets currentSpeed to 0.1
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * Sets currentSpeed to 0
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    private void setCurrentSpeed(double currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed <= enginePower)
        this.currentSpeed = currentSpeed;
    }


    /**
     * Accelerates the car and increases its speed
     * @param amount The percentage currentSpeed shall increase
     */
    public void gas(double amount){
        if (0<=amount && amount <= 1){
        incrementSpeed(amount);}
    }

    /**
     * Deaccelerates the car and decreases its speed
     * @param amount The percentage currentSpeed shall decrease
     */
    public void brake(double amount){
        if (0<=amount && amount <= 1)
        decrementSpeed(amount);
    }

    /**
     * Moves the car after its currentSpeed and course
     */
    @Override
   public void move(){
    positionX = positionX + currentSpeed * Math.sin(course);
    positionY =positionY + currentSpeed * Math.cos(course);
    }

    /**
     * Changes the cars direction with minus 90 degrees
     */
    @Override
    public void turnLeft(){
    course -= 90;
    }

    /**
     * Changes the cars direction with plus 90 degrees
     */
    @Override
   public void turnRight(){
    course += 90;
    }

    public double getCourse() {
        return course;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }
    /**
     * Increases the Saabs speed after its currentSpeed, speedFactor and amount
     * @param amount How much the speed would increase without speedFactor
     */
    private void incrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    /**
     * Decreases the Saabs speed after its currentSpeed, speedFactor and amount
     * @param amount How much the speed would decrease without speedFactor
     */
    private void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }

    protected abstract double speedFactor();
}

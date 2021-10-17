package com.example.abstraction;

abstract class Bike{
    /**
     * This is the Constructor of the class "Bike"
     * It is printing "Bike is Created"
     */
    Bike(){
        System.out.println("Bike is Created");
    }

    /**
     * This abstract method "run" is initialized
     */
    abstract void run();

    /**
     * This is the method of "gearChanged"
     * It is printing "Gear Changed"
     */
    void gearChanged(){
        System.out.println("Gear Changed");
    }

}
class Honda extends Bike{
    /**
     * Here, we are defining the method "run" of the abstract class Bike(parent)
     * This method is printing "Bike is running safely"
     */
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Bike bike=new Honda();
        /**
         * Here, mehod run is called by the object we made of the class Bike
         */
        bike.run();
        /**
         * Here, mehod gearChanged is called by the object we made of the class Bike
         */
        bike.gearChanged();
    }

}

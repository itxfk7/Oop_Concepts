package com.example.abstraction;

interface Vehicle{
    /**
     * This method "vigo" is initialized in interface "Vehicle"
     */
    void vigo();
    /**
     * This method "honda" is initialized in interface "Vehicle"
     */
    void honda();
    /**
     * This method "audi" is initialized in interface "Vehicle"
     */
    void audi();
    /**
     * This method "ferrari" is initialized in interface "Vehicle"
     */
    void ferrari();
}

/**
 * This abstract class "Truck" implements Vehicle interface
 */
abstract class Truck implements Vehicle{
    /**
     * Here this method "vigo" is defined and it is printing "This is a Truck"
     */
   public void vigo(){
       System.out.println("This is a Truck");

    }
}
/**
 * This class "Cars" extends abstract class "Truck"
 */
class Cars extends Truck{
    /**
     * Here this method "honda" is defined and it is printing "This is Honda"
     */
    public void honda(){
        System.out.println("This is Honda");

    }
    /**
     * Here this method "audi" is defined and it is printing "This is audi"
     */
    public void audi(){
        System.out.println("This is audi");

    }
    /**
     * Here this method "ferrari" is defined and it is printing "This is ferrari"
     */
    public void ferrari(){
        System.out.println("This is ferrari");

    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        Vehicle object=new Cars() ;
        /**
         * Here, mehod vigo is called by the object we made
         */
        object.vigo();
        /**
         * Here, mehod honda is called by the object we made
         */
        object.honda();
        /**
         * Here, mehod audi is called by the object we made
         */
        object.audi();
        /**
         * Here, mehod ferrari is called by the object we made
         */
        object.ferrari();
    }
}

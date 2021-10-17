package com.example.polymorphism;



class Bank{
    /**
     * This method does not have any parameter
     * This method returns 0
     */
    int getRateOfInterest(){return 0;}
}
class HBL extends Bank{
    /**
     * This method is overridden from parent class "Bank"
     * This method does not have any parameter
     * This method returns 5
     */
    @Override
    int getRateOfInterest() {
        return 5;
    }
}
class ABL extends Bank{
    /**
     * This method is overridden from parent class "Bank"
     * This method does not have any parameter
     * This method returns 10
     */
    @Override
    int getRateOfInterest() {
        return 10;
    }
}

class UBL extends Bank{
    /**
     * This method is overridden from parent class "Bank"
     * This method does not have any parameter
     * This method returns 15
     */
    @Override
    int getRateOfInterest() {
        return 15;
    }
}
public class Runtime {
    public static void main(String[] args) {
        HBL hbl=new HBL();
        ABL abl=new ABL();
        UBL ubl=new UBL();
        /**
         * Here, method "getRateOfInterest" is called by using class "HBL" object so method in HBL class will be called
         */
        System.out.println("HBL Rate of Interest : "+hbl.getRateOfInterest());
        /**
         * Here, method "getRateOfInterest" is called by using class "ABL" object so method in ABL class will be called
         */
        System.out.println("ABL Rate of Interest : "+abl.getRateOfInterest());
        /**
         * Here, method "getRateOfInterest" is called by using class "UBL" object so method in UBL class will be called
         */
        System.out.println("UBL Rate of Interest : "+ubl.getRateOfInterest());
    }
}

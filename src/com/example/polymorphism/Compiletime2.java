package com.example.polymorphism;


class Adder2{
    /**
     * This method is accepting 2  int parameters.
     * This method "add" is adding 2 int values.
     * Then this method is returning the sum of 2 values a and b
     */
    static int add(int a, int b){
        return a+b;
    }
    /**
     * This method is accepting 3 double parameters.
     * This method "add" is adding 3 double values.
     * Then this method is returning the sum of 3 values a,b and c
     */
    static double add(double a, double b, double c){
        return a+b+c;
    }

}
public class Compiletime2 {
    public static void main(String[] args) {
        /**
         * Here, Static method add(accepting 2 parameters of int) is called using class name and by sending 2 int values
         */
        System.out.println(Adder2.add(5,5));
        /**
         * Here, Static method add(accepting 3 parameters of double) is called using class name and by sending 3 double values
         */
        System.out.println(Adder2.add(5.1,5.2,5.3));

        /**
         * So here, compile time polymorphism(method overloading) two methods in the same class can be differtiated by changing the no. of parameters and changing the datatype of the parameters and can be called separately one by one
         */

    }
}

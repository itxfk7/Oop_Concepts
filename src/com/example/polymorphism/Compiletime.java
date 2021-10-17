package com.example.polymorphism;


class Adder{
    /**
     * This method is accepting 2  int parameters.
     * This method "add" is adding 2 int values.
     * Then this method is returning the sum of 2 values a and b
     */
    static int add(int a, int b){
        return a+b;
    }
    /**
     * This method is accepting 3 int parameters.
     * This method "add" is adding 3 int values.
     * Then this method is returning the sum of 3 values a,b and c
     */
    static int add(int a,int b, int c){
        return a+b+c;
    }
}
public class Compiletime
{
    public static void main(String[] args) {
        /**
         * Here, Static method add(accepting 2 parameters) is called using class name and by sending 2 int values
         */
        System.out.println(Adder.add(5,5));
        /**
         * Here, Static method add(accepting 3 parameters) is called using class name and by sending 3 int values
         */
        System.out.println(Adder.add(5,5,5));

        /**
         * So here, compile time polymorphism(method overloading) two methods in the same class can be differtiated by changing the no. of parameters and can be called separately one by one
         */


    }
}

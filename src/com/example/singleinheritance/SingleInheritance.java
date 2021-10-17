package com.example.singleinheritance;





class Animal {

    /**
     * This method "eat" is in parent class "Animal" and is printing "This is eating"
     */
    void eat() {
        System.out.println("This is eating");
    }
}

class Dog extends Animal {
    /**
     * This method "bark" is in child class "Dog" which extends "Animal" class and is printing "This is barking"
     */
    void bark() {
        System.out.println("This is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog= new Dog();
        /**
         * Here, Although "eat" is the method of Animal(Parent) class is called by Dog(child) class object due to inheritance
         */
        dog.eat();
        /**
         * Dog class method is called
         */
        dog.bark();

    }

}

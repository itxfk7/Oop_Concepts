package com.example.hierarchicalinheritance;

class Animal{
    void eat(){
        /**
         * This method "eat" is in parent class "Animal" and is printing "This is eating"
         */
        System.out.println("This is Eating");
    }
}
class Dog extends Animal{
    /**
     * This method "bark" is in child class "Dog" which extends "Animal" class and is printing "This is barking"
     */
    void bark(){
        System.out.println("This is Barking");
    }
}

class Cat extends Animal{
    /**
     * This method "meow" is in child class "Cat" which extends "Animal" class and is printing "This is Meow"
     */
    void meow(){
        System.out.println("This is Meow");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat=new Cat();
        /**
         * Here, Although "eat" is the method of Animal(Parent) class is called by Cat(child) class object due to inheritance
         */
        cat.eat();
        /**
         * Cat class method is called
         */
        cat.meow();


        /**
         * Now here if we want to call the "bark" method from the dog class then we have to make its object and then call it wih it because "Cat" does not extends "Dog" class
         */
    }
}

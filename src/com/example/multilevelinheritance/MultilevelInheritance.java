package com.example.multilevelinheritance;

class Animal{
    /**
     * This method "eat" is in parent class "Animal" and is printing "This is eating"
     */
    void eat(){
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

class Cat extends Dog{
    /**
     * This method "meow" is in child class "Cat" which extends "Dog" class and is printing "This is Meow"
     */
    void meow(){
        System.out.println("This is Meow");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Cat cat=new Cat();
        /**
         * Here, Although "eat" is the method of Animal(Parent) class is called by Cat(child) class object due to inheritance
         */
        cat.eat();
        /**
         * Here, Although "bark" is the method of Dog(Parent) class is called by Cat(child) class object due to inheritance
         */
        cat.bark();
        /**
         * Cat class method is called
         */
        cat.meow();

    }
}

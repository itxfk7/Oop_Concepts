package com.example.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Student student=new Student();
        /**
         * Here, method "setName" is called by sending the String "Faraz" by the object we made of the Student class
         */
        student.setName("Faraz");
        /**
         * Here, method "getName" is called by the object we made of the Student class and printing it.
         */
        System.out.println(student.getName());
    }
}

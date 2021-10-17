package com.example.encapsulation;

public class Student {
    private String name;

    /**
     * This method does not have any parameter
     * This method returns String variable "name"
     */
    public String getName(){
        return name;
    }

    /**
     * This method is accepting String parameter name
     * This method is assigning the value of th variable name to name by using "this" keyword because variable is initialized outside the method
     */
    public void setName(String name){
        this.name=name;
    }
}


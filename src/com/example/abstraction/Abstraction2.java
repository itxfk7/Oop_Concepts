package com.example.abstraction;

interface A{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A{
   public void a(){
       System.out.println("This is a");

    }
}
class C extends B{
    public void b(){
        System.out.println("This is b");

    }
    public void c(){
        System.out.println("This is c");

    }
    public void d(){
        System.out.println("This is d");

    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        A e=new C();
        e.a();
        e.b();
        e.c();
        e.d();
    }
}

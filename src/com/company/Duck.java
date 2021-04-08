package com.company;

public class Duck extends Bird implements Flyable,Eatable, Swimmable {
    static int count;

    @Override
    public void incrementCount() {
        count++;
    }
    public int getCount() {
        return count;
    }
    @Override
    public void decrementCount() {
         count--;
    }
    @Override
    public void eat() {
        System.out.println("Duck is eating ");
    }
    @Override
    public void swim() {
        System.out.println("Duck is swimming ");
    }
    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }
}

package com.company;

public class Parrot extends Bird implements Flyable,Eatable {

    static int count;
    @Override
    void incrementCount() {
        count++;
    }
    @Override
    int getCount() {
        return count;
    }
    @Override
    public void decrementCount() {
        count--;
    }
    @Override
    public void eat() {
        System.out.println("Parrot is eating ");
    }
    @Override
    public void fly(){
        System.out.println("parrot is flying");
    }
}

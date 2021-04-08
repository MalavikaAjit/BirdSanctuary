package com.company;

public class ToyDuck extends Bird  implements Flyable, Eatable, Swimmable {
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
        System.out.println("ToyDuck is eating ");
    }
    @Override
    public void swim() {
        System.out.println("ToyDuck is swimming ");
    }
    @Override
    public void fly(){
        System.out.println("ToyDuck is flying");
    }
}



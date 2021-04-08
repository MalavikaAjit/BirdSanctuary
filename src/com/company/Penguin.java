package com.company;

public class Penguin extends Bird implements Swimmable,Eatable{
    static  int count;

    @Override
    void incrementCount() {
        count++;
    }
    @Override
    public int getCount() {
        return count;
    }
    @Override
    public void decrementCount() {
        count--;
    }
    public void eat() {
        System.out.println("penguin is eating ");
    }
    public void swim() {
        System.out.println("Penguin is swimming");
    }
    public void fly(){
    }
}

package com.company;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdSanctuary {
    private static BirdSanctuary instance;
    private Set<Bird> allBirds = new HashSet<>();

    private BirdSanctuary(){
    }
    public synchronized static BirdSanctuary getInstance(){
        if(instance == null){
            instance = new BirdSanctuary();
        }
        return instance;
    }
    public void add(Bird bird) {
        allBirds.add(bird);
        bird.incrementCount();
    }
    public void remove(Bird bird){
        allBirds.remove(bird);
        bird.decrementCount();
    }
    public void printFlyable() {
        for (Bird bird : allBirds) {
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }
    public void printEatable() {
        for (Bird bird : allBirds) {
            if (bird instanceof Eatable) {
                ((Eatable)bird).eat();
            }
        }
    }
    public void printSwimmable() {
        for (Bird bird : allBirds) {
            if (bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
        }
    }
}


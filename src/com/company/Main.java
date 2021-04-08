package com.company;

import com.company.BirdSanctuary;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        BirdSanctuary birdSanctuary =BirdSanctuary.getInstance();

        Parrot parrot = new Parrot();
        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        Duck duck1=new Duck();
        ToyDuck toyDuck=new ToyDuck();

        birdSanctuary.add(parrot);
        birdSanctuary.add(penguin);
        birdSanctuary.add(duck);
        birdSanctuary.add(duck1);
        birdSanctuary.add(toyDuck);

        birdSanctuary.remove(duck1);

        birdSanctuary.printFlyable();
        birdSanctuary.printSwimmable();
        birdSanctuary.printEatable();

        System.out.println(duck.getCount());
        System.out.println(toyDuck.getCount());
        System.out.println(parrot.getCount());
        System.out.println(penguin.getCount());

    }

}

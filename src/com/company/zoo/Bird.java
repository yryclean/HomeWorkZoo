package com.company.zoo;

public class Bird extends Animal {

    public Bird(int legs, String breath, String moves) {
        super(legs, breath, moves);
    }

    @Override
    public void speaks() {
        System.out.println("Bird have: " + legs + " legs");
        System.out.println("Bird breath: " + breath);
        System.out.println("Bird can move and live: " + moves);
    }

    public void fly() {
        System.out.println("Birds can fly");
    }
}

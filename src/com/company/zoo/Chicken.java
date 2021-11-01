package com.company.zoo;

public class Chicken extends  Bird {
    Chicken(int legs, String breath, String moves) {
        super(legs, breath, moves);
    }

    @Override
    public void fly() {
        System.out.println("Chicken cannot fly on long range, it's more like jumping with a help of wings");
    }

    @Override
    public void speaks() {
        System.out.println("Chicken have: " + legs + " legs");
        System.out.println("Chicken breath: " + breath);
        System.out.println("Chicken can move and lives: " + moves);
    }
}
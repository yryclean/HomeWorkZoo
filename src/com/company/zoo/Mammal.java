package com.company.zoo;

public class Mammal extends Animal {
    Mammal(int legs, String breath, String moves) {
        super(legs, breath, moves);
    }

    public void speaks() {
        System.out.println("Mammal have: " + legs + " legs");
        System.out.println("Mammal breath: " + breath);
        System.out.println("Mammal moves and lives: " + moves);
    }
}
package com.company.zoo;

public class Fish extends Animal implements Swims {
    Fish(int legs, String breath, String moves) {
        super(legs, breath, moves);
    }

    public void swim() {
        System.out.println("Fish swims in water and cannot live outside the water");
    }

    @Override
    public void speaks() {
        System.out.println("Fish have: " + legs + " legs, it has fins and tail");
        System.out.println("Fish breath: " + breath);
        System.out.println("Fish moves and lives: " + moves);
    }
}


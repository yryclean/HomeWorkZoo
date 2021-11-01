package com.company.zoo;

public class Animal {
    int legs;
    String breath;
    String moves;

    protected Animal(int legs, String breath, String moves) {
        this.legs = legs;
        this.moves = moves;
        this.breath = breath;
    }
    public void speaks() {
        System.out.println("Animals have: " + legs + " legs");
        System.out.println("Animal breath: " + breath);
        System.out.println("Animal moves and lives: " + moves);

    }

    }


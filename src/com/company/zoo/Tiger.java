package com.company.zoo;

public class Tiger extends Mammal implements Predator {
    Tiger(int legs, String breath, String moves) {
        super(legs, breath, moves);
    }

    @Override
    public void hunt() {
        System.out.println("Tiger hunts on other animals to eat them");
    }

    @Override
    public void speaks() {
        System.out.println("Tiger have: " + legs + " legs");
        System.out.println("Tiger breath: " + breath);
        System.out.println("Tiger moves and lives: " + moves);
    }
}
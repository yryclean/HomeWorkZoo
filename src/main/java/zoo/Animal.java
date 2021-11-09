package zoo;

public class Animal {
    int legs;
    int wings;
    String breath;
    String moves;

    protected Animal(int legs, int wings, String breath, String moves) {
        this.legs = legs;
        this.moves = moves;
        this.breath = breath;
        this.wings = wings;
    }
    public void speaks() {
        System.out.println("Animals have: " + legs + " legs");
        System.out.println("Animal breath: " + breath);
        System.out.println("Animal moves and lives: " + moves);

    }

    }


package zoo;

public class Mammal extends Animal {
    public Mammal(int legs, int wings, String breath, String moves) {
        super(legs, wings, breath, moves);
    }

    public void speaks() {
        System.out.println("Mammal have: " + legs + " legs");
        System.out.println("Mammal breath: " + breath);
        System.out.println("Mammal moves and lives: " + moves);
    }
}
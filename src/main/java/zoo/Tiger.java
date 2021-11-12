package zoo;

public class Tiger extends Mammal implements Predator {

    Tiger(int legs, int wings, String breath, String moves) {
        super(legs, wings, breath, moves);
    }

    @Override
    public void hunt() {
        System.out.println("Tiger hunts on other animals to eat them");
    }

    @Override
    public void speaks() {
        System.out.println("Tiger has: " + legs + " legs");
        System.out.println("Tiger breath: " + breath);
        System.out.println("Tiger moves and lives: " + moves);
    }
}
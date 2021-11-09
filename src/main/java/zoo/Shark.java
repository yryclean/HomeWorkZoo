package zoo;

public class Shark extends Fish implements Swims, Predator {
    Shark(int legs, int wings, String breath, String moves) {
        super(legs, wings, breath, moves);
    }

    @Override
    public void swim() {
        System.out.println("Shark swims in water and cannot live outside the water");
    }

    @Override
    public void speaks() {
        System.out.println("Shark has no legs, it has fins and tail");
        System.out.println("Shark breath: " + breath);
        System.out.println("Shark moves and lives: " + moves);
        System.out.println("Shark can stop to have a rest for an 1 hour, if more it can die of asphyxiation");
    }
    @Override
    public void hunt() {
        System.out.println("Shark hunts on other fish, birds or little animals that get in water");
    }

}
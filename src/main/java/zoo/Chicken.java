package zoo;

public class Chicken extends  Bird {
    Chicken(int legs, int wings, String breath, String moves) {
        super(legs, wings, breath, moves);
    }

    @Override
    public void fly() {
        String cannotFly = "Chicken is a household bird, so it cannot fly. It's flying is more like long jumping with a help of wings";
        int wings = 2;
        boolean isHouseHold = true;
        if (wings == 2 && isHouseHold) {
            System.out.println(cannotFly);
        }
    }

    @Override
    public void speaks() {
        System.out.println("Chicken has: " + legs + " legs");
        System.out.println("Chicken breath: " + breath);
        System.out.println("Chicken can move and lives: " + moves);
    }
}
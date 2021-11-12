package zoo;

public class Bird extends Animal {

    public Bird(int legs, int wings, String breath, String moves) {
        super(legs, wings, breath, moves);
    }

    @Override
    public void speaks() {
        System.out.println("Bird have: " + legs + " legs" + " and " + wings + "wings");
        System.out.println("Bird breath: " + breath);
        System.out.println("Bird can move and live: " + moves);
    }

    public void fly() {
        String canFly = "Almost all birds that live in wild nature can fly. Except penguins, ostrich and some others";
        String cannotFly = "Farmers or house hold birds cannot fly, even while they having a wings they still only can jump";
        int wings = 2;
        boolean isHouseHold = true;
        if(wings == 2 && !isHouseHold) {
            System.out.println(canFly);
        } else
            System.out.println(cannotFly);
    }
}

package zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String tiger = "Tiger";
        String chicken = "Chicken";
        String shark = "Shark";
        int nrTiger = 1;
        int nrChicken = 2;
        int nrShark = 3;

        String nrOfAnimals = String.format("To get info about %s press %d. To get info about %s press %d. To get info about %s press %d.", tiger, nrTiger, chicken, nrChicken, shark, nrShark);
        System.out.println(nrOfAnimals);
        int number = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);

        switch (number) {
            case 1:
                System.out.println();
                Tiger tiger1 = new Tiger(4, 0, "air", "on land");
                tiger1.speaks();
                tiger1.hunt();
                scanner.nextInt();
            case 2:
                System.out.println();
                Chicken chicken1 = new Chicken(2, 2, "air", " on land and a bit in air");
                chicken1.speaks();
                chicken1.fly();
                scanner.nextInt();
            case 3:
                System.out.println();
                Shark shark1 = new Shark(0, 0, "air from water", "in water");
                shark1.speaks();
                shark1.swim();
                shark1.hunt();
                scanner.nextInt();
        }
    }
}

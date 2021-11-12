package scooters;

public class KugooG2Pro implements MaxPower {
    private int battery;
    private int power;
    private final int controller = 30;

    public KugooG2Pro(int wheel) {
        this.battery = wheel;
        setPower();
    }
    private void setPower() {
        power = battery * controller;
    }
    @Override
    public double getPower() {
        return power;
    }
}

package scooters;

public class XiaomiM365 implements MaxPower {
    private int battery;
    private int power;
    private final int controller = 30;

    public XiaomiM365(int wheel) {
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

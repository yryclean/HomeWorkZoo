package scooters;

public class KingSongDS11 implements MaxPower {
    private int battery;
    private int power;
    private final int controller = 30;
    private final int nrOfControllers = 2;

    public KingSongDS11(int wheel) {
        this.battery = wheel;
        setPower();
    }
    private void setPower() {
        power = nrOfControllers * (battery * controller);
    }
    @Override
    public double getPower() {
        return power;
    }
}

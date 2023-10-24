public class Fridge2 {
    private final String branch;
    private final int temperature;

    public Fridge2(int temperature) {
        this.branch = "Branch1";
        this.temperature = temperature;
    }

    public int getCelsiusTemperature() {
        return temperature;
    }

    public int getFahrenheitTemperature() {
        return (temperature * 9/5) + 32;
    }

    public String getBranch() {
        return branch;
    }
}

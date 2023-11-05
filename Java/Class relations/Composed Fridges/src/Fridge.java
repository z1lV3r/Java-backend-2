public class Fridge {

    private final String branch;
    private final float temperature;

    protected Fridge(String branch, float temperature) {
        this.branch = branch;
        this.temperature = temperature;
    }

    public float getCelsiusTemperature() {
        return temperature;
    }

    public float getFahrenheitTemperature() {
        return (temperature * 9/5) + 32;
    }

    public float getKelvinTemperature() {
        return temperature + 273.15f;
    }

    public String getBranch() {
        return branch;
    }
}

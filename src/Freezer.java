/**
 * Represents a Freezer and it's characteristics.
 */
public class Freezer {
    /**
     * Represents the model of the freezer.
     */
    String model;
    /**
     * Represents the actual temperature of the freezer.
     */
    private float temperature;
    /**
     * Represents the target temperature of the freezer.
     */
    public float targetTemperature;


    /**
     * @return the actual temperature of the freezer.
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @return the target temperature of the freezer.
     */
    public float getTargetTemperature() {
        return targetTemperature;
    }

    /**
     * Sets the target temperature of the freezer
     *
     * @param targetTemperature the desired temperature of the freezer.
     */
    public void setTargetTemperature(float targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    /**
     * Reduces the actual temperature of the freezer if the actual temperature is lower than the target temperature.
     */
    public void cool() {
        if (temperature < targetTemperature) temperature--;
    }
}

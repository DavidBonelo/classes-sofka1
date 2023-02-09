import java.util.Timer;
import java.util.TimerTask;

/**
 * Represents a Fan and it's characteristics.
 */
public class Fan {
    /**
     * Represents the speed of the fan.
     */
    private Speed speed = Speed.OFF;
    /**
     * Represents the timer when the fan will turn off.
     */
    private long timer = 0;
    /**
     * Represents if the fan is oscillating or not.
     */
    private boolean oscillate = false;

    /**
     * @return the actual speed of the fan.
     */
    public Speed getSpeed() {
        return speed;
    }

    /** Sets the speed of the fan.
     * @param speed the new speed.
     */
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    /**
     * @return the actual timer.
     */
    public double getTimer() {
        return timer;
    }

    /** Sets the timer to turn off the fan.
     * @param milliseconds the time in milliseconds for the timer.
     */
    public void setTimer(long milliseconds) {
        this.timer = milliseconds;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                timer = 0;
                speed = Speed.OFF;
            }
        }, milliseconds);
    }

    /**
     * @return true if the fan is oscillating.
     */
    public boolean isOscilating() {
        return oscillate;
    }

    /** Sets the oscillation status of the fan.
     * @param oscillate whether the fan has to oscillate or not.
     */
    public void setOscilation(boolean oscillate) {
        this.oscillate = oscillate;
    }
}

/**
 * enum to parametrize the speed values.
 */
enum Speed {
    OFF,
    SLOW,
    NORMAL,
    FAST
}

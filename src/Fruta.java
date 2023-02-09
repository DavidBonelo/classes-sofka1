import java.util.ArrayList;

/**
 * Represents a Fruit and it's characteristics.
 */
public class Fruta {

    /**
     * Represents the name of the fruit.
     */
    String name;
    /**
     * Represents the average weight of the fruit.
     */
    private float averageWeight;
    /**
     * Represents the colors the fruit has.
     */
    ArrayList<String> colors;


    /** Sets the color to the fruit.
     * @param color one of the colors of the fruit.
     */
    public void setColor(String color) {
        this.colors.add(color);
    }

    /**
     * @return ArrayList with the colors of the fruit
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }
}

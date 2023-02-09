import java.util.Date;
/**
 * Represents a Person and it's characteristics.
 */
public class Persona {
    /**
     * Represents the name of the contact.
     */
    private String name;
    /**
     * Represents the first last name of the contact.
     */
    String lastName1;
    /**
     * Represents the second last name of the contact.
     */
    String lastName2;
    /**
     * Represents the date of birth of the contact.
     */
    Date dateBirth;
    /**
     * Represents the height of the contact.
     */
    float height;

    /** Sets the name of the contact.
     * @param name name of the contact
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return name of the contact
     */
    public String getName() {
        return this.name;
    }

}

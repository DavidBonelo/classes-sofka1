/**
 * Represents a Contact and it's characteristics.
 */
public class Contact {
    /**
     * Represents the name of the contact.
     */
    String name;
    /**
     * Represents the phone number of the contact.
     */
    double phoneNumber;
    /**
     * Represents the address of the contact.
     */
    String address;

    /**
     * Creates an instance of the contact class with the basic information.
     * @param name the name of the contact.
     * @param phoneNumber the phone number of the contact.
     * @param address the address of the contact.
     */
    public Contact(String name, double phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

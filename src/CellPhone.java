import java.util.ArrayList;
/**
 * Represents a Cellphone and it's characteristics.
 */
public class CellPhone {
    /**
     * Represents the number of the cellphone.
     */
    double number;
    /**
     * Represents the imei of the cellphone.
     */
    protected final double imei;
    /**
     * Represents the list of contacts saved on the cellphone.
     */
    private ArrayList<Contact> contacts;


    /**
     * Creates an instance of the cellphone class with a fixed imei number.
     * @param imei
     */
    public CellPhone(double imei) {
        this.imei = imei;
    }

    /**
     * @return the imei number of the cellphone.
     */
    public double getImei() {
        return imei;
    }

    /** Calls a contact by its contact information.
     * @param contact contact to call.
     */
    public void callContact(Contact contact) {
        System.out.println("Calling " + contact.name);
    }

    /** Calls a person by its phone number.
     * @param number number to call.
     */
    public void callContact(double number) {
        System.out.println("Calling " + number);
    }

    /** Adds a contact to the cellphone list.
     * @param contact contact to add.
     */
    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    /** Removes a contact from the cellphone list.
     * @param contact contact to remove.
     * @return true if removal was successful.
     */
    public boolean removeContact(Contact contact){
        return this.contacts.remove(contact);
    }

}

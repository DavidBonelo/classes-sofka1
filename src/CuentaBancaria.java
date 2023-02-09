/**
 * Represents a Bank account and it's characteristics.
 */
public class CuentaBancaria {
    /**
     * Represents the number of the account.
     */
    private int accountNumber;
    /**
     * Represents if the account is active.
     */
    protected boolean activated;

    /** Sets if the account is active or not.
     * @param activated whether the account is active or not.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * @return true if the account is active
     */
    public boolean getActived() {
        return this.activated;
    }
}

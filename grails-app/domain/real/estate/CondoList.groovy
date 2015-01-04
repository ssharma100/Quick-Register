package real.estate

/**
 * List of the real-estate properties in the system.
 *
 * User: ssharma
 * Date: 1/1/14
 * Time: 11:40 PM
 */
public enum CondoList {
    BONIS("288 Bonis Ave #2202, Scarborough, Ontario M1T 3W4"),
    OMNI_123("123 Omni Drive #661, Scarborough, Ontario M1P 5B4"),
    OMNI_115("115 Omni Drive #2035, Scarborough, Ontario M1P 5B4"),
    MCLEVIN("410 McLevin Ave #1007, Scarborough, Ontario M1B 5J5"),
    GRAND_TRUNK("10 Grand Trunk Drive, Toronto, Ontario")

    private String address
    CondoList (String address) {
        this.address = address
    }

    public String getAddress() {
        return this.address
    }
}
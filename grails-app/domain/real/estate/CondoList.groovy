package real.estate

/**
 * List of the real-estate properties in the system.
 *
 * User: ssharma
 * Date: 1/1/14
 * Time: 11:40 PM
 */
public enum CondoList {
    BONIS("288 Bonis Ave, Scarborough, Ontario"),
    OMNI("661 Omni Drive, Scarborough, Ontario"),
    MCLEVIN("123 McLevin Ave, Scarborough, Ontario"),
    GRANDTRUNK("10 Grand Trunk Drive, Toronto, Ontario")

    private String address
    CondoList (String address) {
        this.address = address
    }

    public String getAddress() {
        return this.address
    }
}
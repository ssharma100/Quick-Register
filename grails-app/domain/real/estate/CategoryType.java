package real.estate;

/**
 * Created with IntelliJ IDEA.
 * User: xxx_s_000
 * Date: 1/3/15
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public enum CategoryType {

    INCOME_RENT ("Rental Income For Condo"),
    INCOME_PARKING ("Rental Income For Parking"),
    INCOME_INTEREST ("Bank Chk Or Savings Interest"),
    INCOME_DEPOSIT ("Deposits From Renters"),
    INCOME_DEPOSIT_IMT ("Interest On Deposits");

    private String description;
    CategoryType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

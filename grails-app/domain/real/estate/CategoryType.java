package real.estate;

/**
 * Enumeration used to define the categorization of the expenses
 * or income.  The enum is code based and reflects the structure of
 * the tax forms and accounting categories
 *
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

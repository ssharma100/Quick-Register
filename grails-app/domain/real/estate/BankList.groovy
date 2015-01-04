package real.estate

/**
 * Enum used to store information specific to banks
 * User: ssharma
 * Date: 1/1/14
 * Time: 12:55 PM
 * To change this template use File | Settings | File Templates.
 */
enum BankList {
    CIBC ("CIBC"), RBC ("Royal Bank"), TD ("Toronto Dominion"), SCOTIA ("Scotia Bank"),
    WELLS ("Wells Fargo"), CHASE ("Chase")

    private String fullName;
    BankList (String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName
    }
}

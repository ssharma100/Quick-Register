package real.estate

/**
 * Specifies the detail type that is used to describe the detail
 * specific.
 *
 * User: ssharma
 * Date: 1/1/14
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
public enum DetailType {
    RENT_INCOME (true),
    RENT_REFUND (false),

    SECURITY_DEPOSIT (true),
    SECURITY_REFUND  (false),

    MAINTENANCE_DEDUCTIBLE (true)


    private boolean income;
    DetailType (boolean income) {
        this.income = income;
    }

}
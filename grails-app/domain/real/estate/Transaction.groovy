package real.estate

class Transaction {
    // Use Native GORM Identification For Pk
    Date trxDate
    BankList bank
    String bankRef
    TransactionType type

    static constraints = {
        trxDate blank: false
        bankRef blank: false, size: 5..64, nullable: true
        bank blank: false
        type blank: false
    }

    static hasMany = [transItems: TransItems]

}

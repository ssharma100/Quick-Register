package real.estate

class Transaction {
    // Use Native GORM Identification For Pk
    Date trxDate
    BankList bank
    String bankRef
    TransactionType type
    String payee
    float netamount

    // Relational Mappings
    static hasMany = [items: DetailItem]


    static constraints = {
        trxDate blank: false, nullsble : false
        bankRef blank: false, size: 5..64, nullable: true
        bank blank: false
        type blank: false
    }

}

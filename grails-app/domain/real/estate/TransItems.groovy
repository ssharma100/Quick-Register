package real.estate

class TransItems {

    DetailType type
    String description
    BigDecimal amount
    CondoList condo
    Date occurredOn
    boolean isExpense
    String paidTo
    String expensedBy



    static constraints = {
        type blank: false
        description blank: false, size: 3..64
        amount blank: false, nullable: false
        condo blank: false, nullable: false
        occurredOn blank: false, nullable: false
        paidTo size: 3..32
        expensedBy size: 3..32
    }

    static belongsTo = [transaction: Transaction]

}

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
        amount blank: false, validator: {
            return (it > 0)
        }
        condo blank: false
        occurredOn blank: false
        paidTo size: 3..32
        expensedBy size: 3..32, nullable: true, validator: { val, obj, errors ->
            if (obj.isExpense && val.isEmpty()) errors.rejectValue('expensedBy', 'Must Be Provided For Expensed Item')
        }

    }

    static belongsTo = [transaction: Transaction]

}

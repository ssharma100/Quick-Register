package real.estate

class DetailItem {

    Date actualDate
    String description
    BigDecimal amount
    String enteredBy

    // Associations
    Category category     // The item's categorization for charge/expense
    Entity entity         // The entity to whom funds were paid/expenses

    // Reverse Mapping For Cascading Deletion
    static belongsTo = [transaction: Transaction]

    static constraints = {
        description blank: false, size: 3..128
        amount blank: false, validator: {
            return (it > 0)
        }
        entity nullable: false
        category nullable: false

        enteredBy size: 3..32, nullable: true

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package real.estate

/**
 *
 * @author S. Sharma <ssharma@ooma.com>
 */
class ExpenseInfo {

    Date occurredOn
    String paidBy
    String vendor
    float itemTotal
    float taxTotal
    float grandTotal
    float personalAmount

    // Stores a picture of the receipt
    byte[] image
    String imageType

    static constraints = {
        paidBy: blank: false
        vendor: blank: false
        itemTotal: blank: false
        taxTotal: blank: false
        grandTotal: blank: false
        personalAmount: blank: false

        image: nullable:true
        imageType: inList: ["jpg", "pdf", "gif", "png", "tiff"] validator: { val, obj, errors ->
            if (obj.image != null && val.isEmpty()) errors.rejectValue('imageType', 'Must Be Provided When Attaching Receipt Image')
        }
    }
}


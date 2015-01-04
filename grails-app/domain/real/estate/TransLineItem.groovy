/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package real.estate

/**
 *
 * @author S. Sharma <ssharma@ooma.com>
 */
class TransLineItem {

    Date occurredOn
    String paidBy
    Entity name
    float itemTotal
    float taxTotal
    float grandTotal


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
        imageType: inList: ["jpg", "pdf", "gif", "png", "tiff"]
    }
}


package real.estate

import grails.rest.*

@Resource(uri='/category')
class Cstegory {
    String name
    CondoList condo
    CategoryType catType
    boolean expense

    static constraints = {
    }
}

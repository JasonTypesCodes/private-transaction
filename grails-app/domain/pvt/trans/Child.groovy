package pvt.trans

class Child {

    String name

    static belongsTo = [
            parent: Parent
    ]

    static constraints = {
    }
}

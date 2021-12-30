package pvt.trans

class Parent {

    String name

    static hasMany = [
            children:   Child
    ]

    static mapping = {
        children joinTable: [
                name: 'parent_child'
        ]
    }

    static constraints = {
    }
}

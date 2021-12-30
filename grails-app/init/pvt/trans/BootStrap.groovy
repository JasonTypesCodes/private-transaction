package pvt.trans

class BootStrap {

    def init = { servletContext ->
        Parent p = new Parent(name: 'Jason')
        p.save()

        Child c = new Child(name: 'Alice', parent: p)
        c.save()
    }
    def destroy = {
    }
}

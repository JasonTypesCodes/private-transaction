package pvt.trans

import grails.gorm.transactions.Transactional
import org.hibernate.Hibernate

@Transactional
class ParentService {

    Parent getParent(String name) {
        Parent.findByName(name)
    }

    Child getFirstChild(String parentName) {
        getFirstChild(getParent(parentName))
    }

    Child getFirstChild(Parent parent) {
        innerChildFinder(parent)
    }

    Child innerChildFinder(Parent parent) {
        parent.children.first()
    }
}

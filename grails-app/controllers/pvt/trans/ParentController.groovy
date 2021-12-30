package pvt.trans

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ParentController {

    ParentService parentService

    @GetMapping
//    @Transactional
    def index() {
        Parent p = parentService.getParent('Jason')
        Child first = parentService.getFirstChild(p)
//        Child first = parentService.getFirstChild('Jason')
        render first as JSON
    }
}

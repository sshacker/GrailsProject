package myfirstgrailsproject

import grails.gorm.transactions.Transactional

@Transactional
class HomeService {

    def serviceMethod() {
        return "Shivam Sonkar"
    }
}

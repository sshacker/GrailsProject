package myfirstgrailsproject

class HomeController {

    HomeService homeService

    def index() {
        String name = homeService.serviceMethod();
        render(view: 'index', model: [name: name, age: 23])
    }

    def testMe () {
        render(view: 'testMe', model: [firstName:"Shivam", lastName:"Sonkar"])
    }
    // def homepage() { }
}

package mdb

import grails.rest.*

@Resource(uri = '/api/movies', readOnly = false, formats = ['json', 'xml'])
class Movies {
    def springSecurityService

    String userId = "0"
    String title
    int releaseYear
    String summary
    Genres genre
    Directors director

//   String getUserId() {
//        return 1
//        return springSecurityService.principal?.username
//   }

    def beforeInsert() {
        println("------------------------------------------------------")
        if (springSecurityService.principal) {
            userId =  springSecurityService.principal?.username
        } else {
            userId =  "0"
        }
    }
//    static hasMany = [genre: Genres]
//    static hasOne = [director: Directors]

    static constraints = {
        userId nullable: true
    }
}
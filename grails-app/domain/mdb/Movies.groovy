package mdb

import grails.rest.*

@Resource(uri = '/api/movies', readOnly = false, formats = ['json', 'xml'])
class Movies {
    def springSecurityService

    String userId
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
        userId =  springSecurityService.principal?.username
    }


//    static hasMany = [genre: Genres]
//    static hasOne = [director: Directors]
}
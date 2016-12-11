package mdb


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Genres {
    String name
}
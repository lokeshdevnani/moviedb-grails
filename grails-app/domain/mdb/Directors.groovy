package mdb


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Directors {
    String name
}
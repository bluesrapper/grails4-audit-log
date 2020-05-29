package test.g4.api

import grails.plugins.orm.auditable.Auditable

class Usuario implements Auditable {

    String nombre
    String primerApellido
    String segundoApellido

    static constraints = {
    }
}

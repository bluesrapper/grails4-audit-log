package test.g4.api

class BootStrap {

    def init = { servletContext ->
        new Usuario(nombre: "octavio", primerApellido: "juarez", segundoApellido: "molina").save()
    }
    def destroy = {
    }
}

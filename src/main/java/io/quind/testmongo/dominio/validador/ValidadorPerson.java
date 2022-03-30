package io.quind.testmongo.dominio.validador;

import io.quind.testmongo.dominio.modelo.excepciones.ExcepcionesModelo;

public class ValidadorPerson {
    public ValidadorPerson() {
        super();
    }

    public static void campoVacio(String campo, String mensaje)throws ExcepcionesModelo {
        if(campo==null){
            throw new ExcepcionesModelo(mensaje);
        }

    }
}

package io.quind.testmongo.dominio.puerto.repositorio;

import io.quind.testmongo.dominio.modelo.Person;

public interface RepositorioPersona {

    //void crear(Persona persona);
    void guardar(Person person);
}

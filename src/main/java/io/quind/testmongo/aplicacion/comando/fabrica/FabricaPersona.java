package io.quind.testmongo.aplicacion.comando.fabrica;

import io.quind.testmongo.aplicacion.comando.ComandoPersona;
import io.quind.testmongo.dominio.modelo.Person;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FabricaPersona {

    public Person mapToPerson(Map<String,Object> objectMap){
        return new Person.PersonBuilder()
                .setId((String) objectMap.get("id"))
                .setNombre((String) objectMap.get("nombre"))
                .setApellido((String) objectMap.get("apellido"))
                .setCedula((String) objectMap.get("cedula"))
                .setEdad((Integer) objectMap.get("edad"))
                .setSexo((String) objectMap.get("sexo"))
                .build();
    }

    public Person commanToModel(ComandoPersona comandoPersona){
        return new Person.PersonBuilder()
                .setId(comandoPersona.getId())
                .setNombre(comandoPersona.getNombre())
                .setApellido(comandoPersona.getApellido())
                .setCedula(comandoPersona.getCedula())
                .setEdad(comandoPersona.getEdad())
                .setSexo(comandoPersona.getSexo())
                .build();
    }




}

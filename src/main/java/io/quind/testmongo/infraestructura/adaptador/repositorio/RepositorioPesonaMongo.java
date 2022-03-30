package io.quind.testmongo.infraestructura.adaptador.repositorio;

import io.quind.testmongo.aplicacion.comando.fabrica.FabricaPersona;
import io.quind.testmongo.dominio.modelo.Person;
import io.quind.testmongo.dominio.puerto.repositorio.RepositorioPersona;
import io.quind.testmongo.infraestructura.entidad.PersonaEntidad;
import io.quind.testmongo.infraestructura.repositoriomogo.PersonaMongoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RepositorioPesonaMongo implements RepositorioPersona {

    private ModelMapper modelMapper=new ModelMapper();

    @Autowired
    private PersonaMongoRepository personaMongoRepository;
    @Autowired
    private FabricaPersona fabricaPersona;

    

    @Override
    public void guardar(Person person) {
        PersonaEntidad personaEntidad=modelMapper.map(person,PersonaEntidad.class);
        personaMongoRepository.save(personaEntidad);
    }
}

package io.quind.testmongo.infraestructura.repositoriomogo;

import io.quind.testmongo.infraestructura.entidad.PersonaEntidad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaMongoRepository extends MongoRepository<PersonaEntidad, String> {
}

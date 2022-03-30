package io.quind.testmongo.infraestructura.controlador;

import io.quind.testmongo.aplicacion.comando.ComandoPersona;
import io.quind.testmongo.aplicacion.comando.fabrica.FabricaPersona;
import io.quind.testmongo.dominio.puerto.repositorio.RepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping(value = "/persona")
public class ControladorPersona {


   /* @Autowired
    private RepositorioPersona repositorioPersona;
    @Autowired
    private FabricaPersona fabricaPersona;


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void crearPersona(@RequestBody ComandoPersona persona) {
        repositorioPersona.guardar(fabricaPersona.commanToModel(persona));
    }*/
}

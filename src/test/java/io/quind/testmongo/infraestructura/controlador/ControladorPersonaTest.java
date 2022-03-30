package io.quind.testmongo.infraestructura.controlador;

import io.quind.testmongo.TestConexionMongoApplication;
import io.quind.testmongo.dominio.modelo.Person;
import io.quind.testmongo.dominio.puerto.repositorio.RepositorioPersona;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = TestConexionMongoApplication.class)
@AutoConfigureMockMvc
class ControladorPersonaTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private RepositorioPersona repositorioPersona;


    @Autowired
    private MockMvc mockMvc;

    @Test
    void crearPersona() throws Exception {



        mockMvc.perform(post("http://localhost:4567/persona")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"id\":\"1\",\n" +
                        "    \"nombre\":\"john\",\n" +
                        "    \"apellido\":\"doe\",\n" +
                        "    \"cedula\":\"123\",\n" +
                        "    \"edad\":33,\n" +
                        "    \"sexo\":\"masculino\"\n" +
                        "\n" +
                        "}")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    void guardarPersona() {

        Person persona= new Person.PersonBuilder()
                .setId("8")
                .setNombre("john")
                .setApellido("doe")
                .setCedula("123")
                .setEdad(33)
                .setSexo("masculino")
                .build();
        repositorioPersona.guardar(persona);

    }


}
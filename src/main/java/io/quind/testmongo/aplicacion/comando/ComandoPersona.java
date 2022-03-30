package io.quind.testmongo.aplicacion.comando;

public class ComandoPersona {

    private String id;
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String sexo;

    public String getId() {
        return id;
    }

    public ComandoPersona setId(String id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public ComandoPersona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public ComandoPersona setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getCedula() {
        return cedula;
    }

    public ComandoPersona setCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public ComandoPersona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getSexo() {
        return sexo;
    }

    public ComandoPersona setSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }
}

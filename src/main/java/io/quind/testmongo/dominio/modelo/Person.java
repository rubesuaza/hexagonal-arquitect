package io.quind.testmongo.dominio.modelo;

import io.quind.testmongo.dominio.modelo.excepciones.ExcepcionesModelo;
import io.quind.testmongo.dominio.validador.ValidadorPerson;

public class Person {
    private static final String CAMPO_OBLIGATORIO = "campo requerido";

    private String id;
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String sexo;

    private Person() {
        super();
    }

    public static class PersonBuilder{

        private String id;
        private String nombre;
        private String apellido;
        private String cedula;
        private int edad;
        private String sexo;

        public PersonBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public PersonBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PersonBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public PersonBuilder setCedula(String cedula) {
            this.cedula = cedula;
            return this;
        }

        public PersonBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public PersonBuilder setSexo(String sexo) {
            this.sexo = sexo;
            return this;
        }

        public Person build() throws ExcepcionesModelo{
            Person person=new Person();
            ValidadorPerson.campoVacio(id,CAMPO_OBLIGATORIO);
            person.id=id;
            ValidadorPerson.campoVacio(nombre,CAMPO_OBLIGATORIO);
            person.nombre=nombre;
            ValidadorPerson.campoVacio(apellido,CAMPO_OBLIGATORIO);
            person.apellido=apellido;
            ValidadorPerson.campoVacio(cedula,CAMPO_OBLIGATORIO);
            person.cedula=cedula;
            person.edad=edad;
            ValidadorPerson.campoVacio(sexo,CAMPO_OBLIGATORIO);
            person.sexo=sexo;
            return person;
        }
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
}

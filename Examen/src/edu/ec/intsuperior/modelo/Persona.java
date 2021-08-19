
package edu.ec.intsuperior.modelo;

/**
 *
 * @author Jhoss
 */
public class Persona {
    private String nombre;
    private String edad;

    public Persona() {
    }

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String mostrarDatos(){
        return"Ingrese el nombre: "+nombre+"Ingrese la edad: "+edad;
    }
        
        
}

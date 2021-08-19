/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.modelo;
/**
 *
 * @author Jhoss
 */
public class Cliente {
    private String telefonoContacto;
    private String nombre;
    private String edad;

    public Cliente() {
    }

    public Cliente(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

 public String mostrarDatos(){
     return "Ingrese la edad: "+nombre+"\nIngrese edad: "+edad+"\nIngrese el numero de telefono: "+telefonoContacto;
 }
    
    
}

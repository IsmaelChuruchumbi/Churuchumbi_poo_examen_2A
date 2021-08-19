/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.vista;
import edu.ec.intsuperior.modelo.Persona;
import edu.ec.intsuperior.modelo.Cliente;
import javax.swing.JOptionPane;
/**
 *
 * @author Jhoss
 */
public class Aplicacion {
    public static void main(String[] args) {
    
        String p1;
        int fechaNacimiento; 
        double sueldoBruto;
        
        
        p1 = JOptionPane.showInputDialog("INGRESE SUS NOMBRES Y APELLIDOS: ");
        fechaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU FECHA DE NACIMIENTO"+"\n(solo letras): "));
        sueldoBruto = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SUELDO DE LA PERSONA"));
        
        JOptionPane.showMessageDialog(null , "EL NOMBRE DE LA PERSONA ES: "+p1);
        JOptionPane.showMessageDialog(null , "LA FECHA DE NACIMIENTO ES: : "+fechaNacimiento);
        JOptionPane.showMessageDialog(null , "EL SUELDO DE LA PERSONA ES: "+sueldoBruto);
        
        
    }
}
    
        
        
    
     
      
        
    
    


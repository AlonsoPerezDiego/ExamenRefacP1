/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Metodos {
    
    public String nombreYEdad(){
        //Método para introducir el nombre y la edad
        String nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
        String edad = JOptionPane.showInputDialog ("Escriba su edad: ");
        return edad;
    }
}

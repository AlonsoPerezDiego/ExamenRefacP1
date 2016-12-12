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
    
    private String nombre(){
        //Método para introducir el nombre.
        String nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
        return nombre;
    }
    
    private String edad(){
        //Método para introducir la edad.
        
        String edad = JOptionPane.showInputDialog ("Escriba su edad: ");
        return edad;
    }
    
    
    public void mostrar(){ //Método para mostrar todo lo calculado hasta ahora.
        String name = nombre();
        int años =  Integer.parseInt(edad());
        JOptionPane.showMessageDialog(null,  "Meses: "  +años*12,"Numero de meses vividos de " +name,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " +años*365,"Numero de días vividos de "+name,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " +años*365*24,"Numero de horas vividos de "+name,JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }
}

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
    
    public String nombre(){
        //Método para introducir el nombre.
        String nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
        return nombre;
    }
    
    public String edad(){
        //Método para introducir la edad.
        
        String edad = JOptionPane.showInputDialog ("Escriba su edad: ");
        return edad;
    }
    
    private int añosDeVida(){
        //Método para pasar el String edad a un int.
        int años = Integer.parseInt(edad());
        return años;
    }
    
    public int meses(){
        //Método para calcular los meses en funcion de la edad introducida.
        int meses = añosDeVida()*12;
        return meses;
    }
    
    public int dias(){
        //Método para calcular los días en funcion de la edad introducida.
        int dias = añosDeVida()*365;
        return dias;
    }
    
    public int horas(){
        //Método para calcular las horas en funcion de la edad introducida.
        int horas = dias()*24;
        return horas;
    }
}

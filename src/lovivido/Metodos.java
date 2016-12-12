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
    
    private int añosDeVida(){
        //Método para pasar el String edad a un int.
        int años = Integer.parseInt(edad());
        return años;
    }
    
    private int meses(){
        //Método para calcular los meses en funcion de la edad introducida.
        int meses = añosDeVida()*12;
        return meses;
    }
    
    private int dias(){
        //Método para calcular los días en funcion de la edad introducida.
        int dias = añosDeVida()*365;
        return dias;
    }
    
    private int horas(){
        //Método para calcular las horas en funcion de la edad introducida.
        int horas = dias()*24;
        return horas;
    }
    
    public void mostrar(){
        //Método para mostrar todo lo calculado hasta ahora.
        JOptionPane.showMessageDialog(null,  "Meses: "  +meses(),"Numero de meses vividos de " +nombre(),JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " +dias(),"Numero de días vividos de "+nombre(),JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " +horas(),"Numero de horas vividos de "+nombre(),JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);
    }
}

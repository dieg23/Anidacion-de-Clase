/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.clases;

import java.util.Scanner;

/**
 *
 * @author GomTor
 */
public class Concatenacion {
    public String Frase1, Frase2, concatenacion;
    public void OperConcatenacion(){
        Scanner cadena = new Scanner(System.in);
        System.out.print("Introduzca el cadena 1= ");
        Frase1=cadena.nextLine();
        System.out.print("Introduzca el cadena 2= ");
        Frase2=cadena.nextLine();
        concatenacion=Frase1+Frase2;
        System.out.println("Concatenacion: "+concatenacion);
    }
    
}

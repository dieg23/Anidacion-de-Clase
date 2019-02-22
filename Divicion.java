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
public class Divicion {
    public int Num1, Num2, divicion;
    public void OperDivicion(){
        Scanner num = new Scanner(System.in);
        System.out.print("Introduzca el numerador = ");
        Num1=num.nextInt();
        System.out.print("Introduzca el denominador = ");
        Num2=num.nextInt();
        divicion=Num1/Num2;
        System.out.println("La divicion es = "+divicion);
    }
}

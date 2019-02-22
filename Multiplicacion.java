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
public class Multiplicacion {
    public int Num1, Num2, multiplicacion;
    public void OperMultiplicacion(){
        Scanner num = new Scanner(System.in);
        System.out.print("Introduzca el numero 1 = ");
        Num1=num.nextInt();
        System.out.print("Introduzca el numero 2 = ");
        Num2=num.nextInt();
        multiplicacion=Num1*Num2;
        System.out.println("La multiplicacion es = "+multiplicacion);
    }
}

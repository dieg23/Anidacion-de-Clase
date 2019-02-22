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
public class Suma {
    public int Num1, Num2, Num3, suma;
    public void OperSuma(){
        Scanner num = new Scanner(System.in);
        System.out.print("Introduzca el numero 1= ");
        Num1=num.nextInt();
        System.out.print("Introduzca el numero 2= ");
        Num2=num.nextInt();
        System.out.print("Introduzca el numero 3= ");
        Num3=num.nextInt();
        suma=Num1+Num2+Num3;
        System.out.println("La suma es = "+suma);
    }
}

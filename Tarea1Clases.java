/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.clases;
import java.util.Scanner;
/**
 *
 * @author Gomez Torres Diego   
 * Ico - 22
 */
public class Tarea1Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner num = new Scanner(System.in);
        /*do
        {
            do
            {*/
                System.out.println("\t\tMenu"
                        + "\n\n1)Suma"
                        + "\n2)Resta"
                        + "\n3)Divicion"
                        + "\n4)Promedio"
                        + "\n5)Concatenacion"
                        + "\n6)Multiplicacion"
                        + "\n7)Salir");
                opcion=num.nextInt();
                if(opcion<1 || opcion>7)
                {
                    System.out.println("\n\nSu opcion es incorrecta. Vuelva a elegir");
                }
            //}while(opcion<1 || opcion>7);
            switch(opcion){
                case 1:
                {
                    Suma Objeto1 = new Suma();
                    Objeto1.OperSuma();
                }
                    break;
                case 2:
                {
                    Resta Objeto1 = new Resta();
                    Objeto1.OperResta();
                }
                    break;
                case 3:
                {
                    Divicion Objeto1 = new Divicion();
                    Objeto1.OperDivicion();
                }
                    break;
                case 4:
                {
                    Promedio Objeto1 = new Promedio();
                    Objeto1.OperPromedio();
                }
                    break;
                case 5:
                {
                    Concatenacion Objeto1 = new Concatenacion();
                    Objeto1.OperConcatenacion();
                }
                    break;
                case 6:
                {
                    Multiplicacion Objeto1 = new Multiplicacion();
                    Objeto1.OperMultiplicacion();
                }
                    break;
                case 7:
                {
                    System.out.println("\nGracias por usar este programa\n");
                }
                    break;
            }
        //}while(opcion!=7);
    }
}

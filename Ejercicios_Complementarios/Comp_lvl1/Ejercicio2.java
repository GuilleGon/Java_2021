package Ejercicios_Complementarios.Comp_lvl1;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int pnro = scan.nextInt();

        System.out.print("");

        System.out.print("Ingrsee un segundo numero: ");
        int snro = scan.nextInt();
        scan.close();

        System.out.println(pnro + "+"+ snro + "=" +(pnro+snro));
        System.out.println(pnro + "-"+ snro + "=" +(pnro-snro));
        System.out.println(pnro + "x"+ snro + "=" +(pnro*snro));
        System.out.println(pnro + "/"+ snro + "=" +(pnro/snro));
    }
}

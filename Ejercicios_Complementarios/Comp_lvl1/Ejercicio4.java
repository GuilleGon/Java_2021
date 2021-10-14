package Ejercicios_Complementarios.Comp_lvl1;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int nro = scan.nextInt();
        scan.close();

        int result=1;
        for(int i = 1; i<=nro; i++){
            result*=i;
        }

        System.out.println(result);


    }
}

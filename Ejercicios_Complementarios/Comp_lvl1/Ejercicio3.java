package Ejercicios_Complementarios.Comp_lvl1;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int nro = scan.nextInt();
        scan.close();

        int cont = 1;
        while(cont <= nro){
            for(int i = 1; i<=cont; i++){
                System.out.print(i+ " ");
            }
            System.out.println("");
            cont++;
        }

    }
}

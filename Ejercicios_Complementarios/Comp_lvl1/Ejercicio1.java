package Ejercicios_Complementarios.Comp_lvl1;

import java.util.Scanner;
class Ejercicio1{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = scan.nextLine();
        scan.close();


        System.out.print("Hola "+nombre);
    }
}
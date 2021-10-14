package Ejercicios_Complementarios.Comp_lvl1;
import java.util.Scanner;
class Ejercicio8{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una nombre y apellido: ");
        String name = scan.nextLine();
        System.out.print("Ingrese edad: ");
        String edad = scan.nextLine();
        System.out.print("Ingrese direccion: ");
        String dir = scan.nextLine();
        System.out.print("Ingrese ciudad: ");
        String ciu = scan.nextLine();
        scan.close();

        System.out.print(ciu +" - "+ dir +" - "+ edad +" - "+ name);



    }
}
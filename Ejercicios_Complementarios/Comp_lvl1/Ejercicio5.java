package Ejercicios_Complementarios.Comp_lvl1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int pnro = scan.nextInt();

        System.out.print("");

        System.out.print("Ingrsee un segundo numero: ");
        int snro = scan.nextInt();
        scan.close();

        int result= pnro;
        for(int i = 1; i<snro; i++){
            result+=pnro;
        }

        System.out.print(result);

    }
}
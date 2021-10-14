package Ejercicios_Complementarios.Comp_lvl1;
import java.util.Scanner;
class Ejercicio7{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scan.nextLine();
        scan.close();


        String mayus = "";
        for(int i = 0; i< palabra.length() ; i++){

            char chr = palabra.charAt(i);
            if(92 <= chr && chr <=122){
                chr = (char)((chr-32));
            }
            mayus += chr;
        }

        System.out.println(mayus);



    }
}
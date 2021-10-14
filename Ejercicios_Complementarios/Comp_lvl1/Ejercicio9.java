package Ejercicios_Complementarios.Comp_lvl1;
import java.util.Scanner;
class Ejercicio9{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scan.nextLine();

        System.out.print("Ingrese letra a buscar: ");
        String letra = scan.next();
        scan.close();

        int cont = 0;

        for(int i = 0; i<texto.length(); i++){
            if(texto.charAt(i)==letra.charAt(0))
                cont++;
        }

        System.out.println(cont);

    }
}
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 4, 4, 4);
        List<Integer> numeros = new ArrayList<>(new HashSet<>(lista));
        List<Integer> fin = new ArrayList<Integer>();
        int num;
        for(int i=0; i<numeros.size();i++){
            num = factorial(numeros.get(i));
            fin.add(num);
        }
        System.out.println(fin);    
    }

    public static int factorial (int numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }
}
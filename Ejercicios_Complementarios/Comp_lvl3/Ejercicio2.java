import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> fin = new ArrayList<Integer>();
        int num;
        for(int i=0; i<numeros.size();i++){
            num = (int) Math.pow(numeros.get(i), 2);
            fin.add(num);
        }
        System.out.println(fin);
    }
}

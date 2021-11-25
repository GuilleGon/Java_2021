import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
    List<String> palabras =new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        palabras.add("Noviembre");
        palabras.add("");
        palabras.add("Pepito");
        palabras.add("");
        for(int i=0; i<palabras.size(); i++){
            if(palabras.get(i)==null || palabras.get(i).equals(""))
                palabras.remove(i);
        }
        System.out.println(palabras);
    }
}
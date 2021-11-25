import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int contador = 0;
        for(String i:palabras){
            if(i.charAt(0) == 'b' || i.charAt(0) == 'B')
                contador++;
        }
        System.out.println(contador);
    }
}
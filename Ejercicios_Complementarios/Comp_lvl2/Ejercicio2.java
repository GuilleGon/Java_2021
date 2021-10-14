package Ejercicios_Complementarios.Comp_lvl2;
import java.util.ArrayList;
import java.util.List;
 
public class Ejercicio2{
    public static void main(String[] args){
        
       List<Integer> numeros = new ArrayList<Integer>();      
       numeros.add(3);
       numeros.add(4);
       numeros.add(5);
       numeros.add(6);
       System.out.println("Elementos: "+numeros.size());

       for (int i=0;i<numeros.size() ;i++ ) {
       	System.out.println(numeros.get(i));
       }

       System.out.println();
       System.out.println();

       numeros.add(0, 1);
       numeros.add(8);

       System.out.println("Elementos: "+numeros.size());
       for (int i=0;i<numeros.size() ;i++ ) {
       	System.out.println(numeros.get(i));
       }
          
    }
}
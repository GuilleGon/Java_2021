package Ejercicios_Complementarios.Comp_lvl2;

import java.util.ArrayList;
import java.util .List;
 
public class Ejercicio1{
    public static void main(String[] args){
        
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");

        for(int i = 0; i< ciudades.size(); i++){
        	System.out.println("#"+ (i+1) +" "+ciudades.get(i));
        }
        
          
    }
}
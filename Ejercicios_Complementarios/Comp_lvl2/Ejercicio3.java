package Ejercicios_Complementarios.Comp_lvl2;
import java.util.*;
 
public class Ejercicio3{
    public static void main(String[] args){
        
       List<String> barajaF = new ArrayList<>();    

       barajaF.add("A");    
       barajaF.add("2");    
       barajaF.add("3");     
       barajaF.add("4");    
       barajaF.add("5");     
       barajaF.add("6");    
       barajaF.add("7");    
       barajaF.add("8");      
       barajaF.add("9");     
       barajaF.add("J");    
       barajaF.add("Q");    
       barajaF.add("K");    

       
      System.out.println(barajaF);

       System.out.print("Ivertido: ");
       Collections.reverse(barajaF);       
       System.out.print(barajaF);


       System.out.println("");
       Collections.sort(barajaF);
       
      System.out.print(barajaF);

    }
}
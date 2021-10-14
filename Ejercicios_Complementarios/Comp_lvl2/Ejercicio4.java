package Ejercicios_Complementarios.Comp_lvl2;
import java.util.ArrayList;
import java.util .List;
 
public class Ejercicio4{
    public static void main(String[] args){
        
      List<String> nombres = new ArrayList<>();     

      nombres.add("Pepe"); nombres.add("Juan"); nombres.add("Carlos"); nombres.add("Santiago"); 
      nombres.add("Esteban"); nombres.add("Nicolas"); nombres.add("Gonzalo"); nombres.add("Pablo");
      nombres.add("MAximiliano"); nombres.add("Florencia"); nombres.add("Jesica"); nombres.add("Paula"); 

      System.out.println("Curso 1");
      List<String> curso1 = nombres.subList(0, 4);

      for(int i = 0; i< curso1.size(); i++){
        	System.out.println(curso1.get(i));
        }

      System.out.println("");
      System.out.println("Curso 2");
      List<String> curso2 = nombres.subList(0, 4);

      for(int i = 0; i< curso2.size(); i++){
        	System.out.println(curso2.get(i));
        }

      System.out.println("");
      System.out.println("Curso 3");
      List<String> curso3 = nombres.subList(0, 4);

      for(int i = 0; i< curso3.size(); i++){
        	System.out.println(curso3.get(i));
        }

          
    }
}
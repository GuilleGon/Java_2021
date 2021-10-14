package Ejercicios_Complementarios.Comp_lvl2;
import java.util.ArrayList;
import java.util .List;
 
public class Ejercicio5{
    public static void main(String[] args){
        
        List<Integer> horasTrabajadas = new ArrayList<Integer>();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        List<Integer> valorHora = new ArrayList<Integer>();
        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);


        List<Integer> salida = horasTrabajadas.subList(0, horasTrabajadas.size());
        int total = 0;
        int res = 0;
        for(int i = 0; i< valorHora.size(); i++){            
            res = salida.get(i) * valorHora.get(i);
            salida.set(i, res);
            total += res;
        }

        System.out.println(salida);
        System.out.println("total: "+total);



        


        
          
    }
}
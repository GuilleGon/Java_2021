package Ejercicios_Complementarios.Comp_lvl2;
import java.util.*;

public class Ejercicio6{
    public static void main(String[] args){
        
        Empleados emp1 = new Empleados("Jaimito Perez", 10254854, 26, 200);
        Empleados emp2 = new Empleados("Maria Luisa", 12563254, 35, 220);

        Set<Empleados> empleados = new HashSet<>();
        empleados.add(emp1);
        empleados.add(emp2);

        Map<Integer, Integer> sueldo = new HashMap<>();

        for(Empleados emple: empleados){
            sueldo.put(emple.getDni(), (emple.getHorasTrabajadas() * emple.getValorPorHora()));
        }

        System.out.println(sueldo);

        
          
    }
}


class Empleados{

    private String nombreyapellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    Empleados(String nombreyapellido, int dni, int horasTrabajadas, int valorPorHora){
        this.nombreyapellido = nombreyapellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    //NOMBRE

    public void setNombreYApellido(String nombreyapellido){
        this.nombreyapellido = nombreyapellido;
    }

    public String getNombreYApellido(){
        return this.nombreyapellido;
    }

    //dni

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getDni(){
        return this.dni;
    }

    //HORAS TRABAJADAS

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }

    //VALOR POR HORA

    public void setValorPorHora(int valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public int getValorPorHora(){
        return this.valorPorHora;
    }

    @Override
    public String toString(){
        return nombreyapellido + ", " + dni + ", " + horasTrabajadas + ", " + valorPorHora +".";
    }


}
import java.util.*;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Gonzalez", "Guillermo", LocalDate.parse("1997-11-15")),
            new Alumno("Olivera", "Pablo", LocalDate.parse("1997-12-01")),
            new Alumno("Diaz", "Facundo", LocalDate.parse("1997-10-23")),
            new Alumno("Amarilla", "Gas", LocalDate.parse("1988-03-11")),
            new Alumno("Esteban", "Quito", LocalDate.parse("1996-12-23")));
        Map<String, Integer> generado = new HashMap<String, Integer>();
        for(Alumno i: alumnos){
            generado.put(
                (i.getApellido()+" " + i.getNombre()), 
                ((int) ChronoUnit.YEARS.between(i.getFechaNacimiento(), LocalDate.parse("2021-11-20"))));
        }
        System.out.println(generado);
    }
}
class Alumno{
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    public Alumno(String apellido, String nombre, LocalDate fechaNacimiento){
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellido(){//apellido
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getNombre(){//nombre
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento(){//fecha
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString(){
        return apellido +" "+ nombre +" "+ fechaNacimiento;
    }

}
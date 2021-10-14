package Ejercicios_Complementarios.Comp_lvl2;
public class Ejercicio7{
    public static void main(String[] args){
        
            fizzBuzzFuncion(1, 56);
          
    }



    public static void fizzBuzzFuncion(int a, int b){
        String[] array = new String[100];

        if(a < b){
            for(int i = a; i<=b ; i++){
                if(i%2==0 && i%3==0)
                    array[i] = "FizzBuzz";
                else if(i%3==0)
                    array[i] = "Buzz";
                else if (i%2==0)
                    array[i] = "Fizz";
                else 
                    array[i] = String.valueOf(i);
            }

            for(int i = a; i<=b ; i++){
                System.out.print(array[i]+ ", ");
            }
        }else
            System.out.println("El primer numero tiene que ser menor");
    }
}
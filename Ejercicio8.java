import java.util.*;
public class Ejercicio8{
    public static void main (String []args ){

    char opcion= 's';
        Scanner entrada = new Scanner(System.in);

        int aleatorio = (int)(Math.random()*100+1);
        aleatorio = aleatorio*5;

        System.out.println("\nMultiplos de cinco = "+aleatorio);
        System.out.println("a.- Obtener otro número  s.- Salir");
        opcion = entrada.next().charAt(0);
        
        while(opcion != 's'){
            aleatorio = (int)(Math.random()*100+1);
            aleatorio = aleatorio*5;
             System.out.println("\nMultiplos de cinco = "+aleatorio);
            System.out.println("a.- Obtener otro número  s.- Salir");
            opcion = entrada.next().charAt(0);
        }
            
    }
        
}
package entdl;

import java.util.Scanner;

/**
 *
 * @author ocondep01
 */
public class Ejercicio02 {
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero1;
        System.out.println("Por favor, introduzca el primer numero:");
        numero1 = entrada.nextInt();
        
        int numero2;
        System.out.println("Por favor, introduzca un segundo numero:");
        numero2 = entrada.nextInt();
        
        int numero3;
        System.out.println("Por favor, introduzca un tercer numero:");
        numero3 = entrada.nextInt();
        
        if (numero3 > numero2) {
            numero2 = numero3;
        }
        
        if (numero2 > numero1) {
            numero1 = numero2;
        }
        System.out.println("El número mayor de los introducidos es el " + numero1);
    }
    
}

    

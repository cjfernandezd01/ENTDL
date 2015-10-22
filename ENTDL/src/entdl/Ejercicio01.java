/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entdl;
import java.util.Scanner;

/**
 *
 * @author cjfernandezd01
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
    
        int num1, num2;
        
        System.out.print("\t Dime un número entero: ");
        num1 = entrada.nextInt();
        
        System.out.print("\t Dime otro número entero: ");
        num2 = entrada.nextInt();
        
        if (num1 > 10){
            System.out.println("\t La operación que se realizó es producto y el resultado es "+num1*num2);
        }
        else{
            System.out.println("\t La operación que se realizó es suma y el resultado es "+(num1+num2));
        }
    }
}

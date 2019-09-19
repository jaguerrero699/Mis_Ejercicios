
//Autor: Julian Andres Guerrero Ordoñez

package operadoresaritmeticos;

import java.util.Scanner;

        
public class operadoresaritmeticos {

   
    public static void main(String[] args) {
        // SUMA
        Scanner input = new Scanner (System.in);
        
        System.out.println("===SUMA===");
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        
        System.out.print ("Por favor, ingrese el primer entero: ");
        num1 = input.nextInt();
        
        
        System.out.print("Por favo, ingresar el segundo entero: ");
        num2 = input.nextInt();
        
        
        resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
        
        
        // Siguiente operacion resta
        
                System.out.println("===RESTA===");
        
        System.out.print ("Por favor, ingrese el primer entero: ");
        num1 = input.nextInt();
        
        
        System.out.print("Por favo, ingresar el segundo entero: ");
        num2 = input.nextInt();
        
        
        resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
 
        
                // Siguiente operacion multiplicación
        
                System.out.println("===MULTIPLICACIÓN===");
        
        System.out.print ("Por favor, ingrese el primer entero: ");
        num1 = input.nextInt();
        
        
        System.out.print("Por favo, ingresar el segundo entero: ");
        num2 = input.nextInt();
        
        
        resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);  
        
        
        
                        // Siguiente operacion DIVICIÓN
        
                System.out.println("===DIVICIÓN===");
        
        System.out.print ("Por favor, ingrese el primer entero: ");
        num1 = input.nextInt();
        
        
        System.out.print("Por favo, ingresar el segundo entero: ");
        num2 = input.nextInt();
        
        
        resultado = num1 / num2;
        System.out.println("Resultado: " + resultado); 
    }
    
}

// Autor: Julian Andres Guerrero Ordoñez

package operadoresaritmeticos;

import java.util.Scanner;

public class calculadora {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===CALCULADORA");
        //Declaramos e iniciamos las variables
        int Numero1 = 0;
        int Numero2 = 0;
        int Resultado = 0;
        int TipoOperacion = 0;
        
        
        //Mostramos las opciones al usuario para que escoja una.
        System.out.println("Seleccione el tipo de operación");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        TipoOperacion = input.nextInt();
        
        if(TipoOperacion > 0 && TipoOperacion < 5)
        {    
        System.out.println("Ingrese el primer número: ");
        Numero1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        Numero2 = input.nextInt();
        
        if (TipoOperacion == 1){
            System.out.println("Usted ha seleccionado una suma");
            Resultado = Numero1 + Numero2;
        }
        else if (TipoOperacion == 2){
            System.out.println("usted a seleccionado una resta");
              Resultado = Numero1 - Numero2;    
        }
        else if (TipoOperacion == 3){
            System.out.println("Usted a seleccionado una multiplicación");
              Resultado = Numero1 + Numero2;
        }
        else if (TipoOperacion == 4){
            System.out.println("Usted a seleccionado una división");
              Resultado = Numero1 / Numero2;
        }
        System.out.println("El resultado es: " + Resultado);
}
        else{
            System.out.println("Ingrese un dato válido");
        }
    }       
        
    
}
// Autor: Julian Andres Guerrero Ordoñez

package operadoresaritmeticos;

import java.util.Scanner;

public class If {
    
    public static void main(String [] args) {
        //Condicional If
        //Crear un algoritmo que me indique si la contrasena ingresada es correctta
        Scanner input = new Scanner (System.in);
        
        String PassSystem = "1234";
        String PassIngresada = "";
        System.out.println("Por favor, ingresar la contraseña ");
        PassIngresada = input.nextLine ();
        
        if (PassIngresada.equals (PassSystem)){
        System.out.println("Bienvenido!!");
        }
        else {
        System.out.println("ERROR DE CONTRASEÑA");
        }
    }   
}

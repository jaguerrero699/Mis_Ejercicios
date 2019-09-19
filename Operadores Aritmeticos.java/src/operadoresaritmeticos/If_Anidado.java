//Autor: Julian Andres Guerrero Ordoñez
package operadoresaritmeticos;

import java.util.Scanner;

public class If_Anidado {
    Public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        String UserDB = "Julian";
        String Passdb = "Julian123";
        String PassIng = "";
        
        System.out.primln("Por favor, ingrese su usuario: "); 
        UserIng = input.netLine();
        
        if (UserIng.equals(UserDB)){
            System.out.println("porfavor, ingresar su contraseña");
            PassIng = input.nextLine();
        }
       
       if (PassIng.equals(Passdb)){
        System.out.println("Bienbenido!!");
    }    
 }

 else{
    System.out.println("Usuario Incorrecto");
 }  
}
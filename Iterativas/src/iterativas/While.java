/*Autor: Julian Andres Guerrero Ordoñez*/
/* ADSI 1802853 */

package iterativas;

import java.util.Scanner;

public class While {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("===Registro de participantes===");
        System.out.println ("cupo Máximo: 3 participantes");
        
        
        
        int NumeroParticipante = 1;
        
        while(NumeroParticipante <= 3) {
            System.out.println("Participante N. " + NumeroParticipante);
            System.out.println("Por favor, ingresar su número de documento: ");
            NumeroParticipante++;
        
        }
        
    }
    
}


/*AUTOR: Julian Guerrero*/

package operadoresaritmeticos;

public class precedencia_operadores {
    
    public static void  main(String [] arg) {
        
        //Sumar la nota de los 3 estudiantes y obtener el promedio de estas, hacerlo en una sola linea
        //teniendo en cuenta la precedencia de operadores y uso de parenresis.
        //Al final mostrar el resultado del promedio.
        
        System.out.println("===Operadores===");
        
        double Nota1 = 4.8;
        double Nota2 = 2.5;
        double Nota3 = 3.2;
        double resultado=(Nota1 + Nota2 + Nota3)/3;
        
        System.out.println("El promedio es " + resultado);
        
        //Una institución educativa cuenta con 3 sedes y cada sede cuenta con
        // un número determinado de estudiantes.
        //Teniendo en cuenta el total de estudiantes se entregan 3 boletas a cada uno.
        //cuantas boletas es necesario imprimir. Hacer la operación en una sola linea?.
    
        int Sede_1 = 180;
        int Sede_2 = 480;
        int Sede_3 = 1200;
        int Total = 0;
        int Suma = 0;
        
        Suma=(Sede_1 + Sede_2 + Sede_3);
        
        System.out.println("El  Num de boletas a imprimer son:  " + Suma);
        
    }
    
    
    
    
    
}

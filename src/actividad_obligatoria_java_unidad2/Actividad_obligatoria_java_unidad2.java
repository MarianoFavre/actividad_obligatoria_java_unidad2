/*
Crear un programa en java en el cual se pida al usuario ingresar su nombre, 
apellido, edad, hobbie, editor de código preferido, sistema operativo que 
utiliza, luego deberá mostrarse por consola los datos ingresados.
 */
package actividad_obligatoria_java_unidad2;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Actividad_obligatoria_java_unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese: ");
        
        System.out.print("\n" + "- Nombre: ");
        String nombre = sc.next();
        
        System.out.print("- Apellido: ");
        String apellido = sc.next();
        
        System.out.print("- Edad: ");
        int edad = sc.nextInt();
        
        System.out.print("- Hobbie: ");
        String hobbie = sc.next();
        
        System.out.print("- Editor de código preferido: ");
        String editorCodigo = sc.next();
        
        System.out.print("- Sistema operativo que utiliza: ");
        String sistemaOperativo = sc.next();
        
        System.out.println("\n"+ "Nombre :" + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor de código preferido: " + editorCodigo);
        System.out.println("Sistema operativo que utiliza: " + sistemaOperativo);
        
        
        
        
        
        
    }
    
}

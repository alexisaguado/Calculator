
package calculadoraentornos;

import java.util.Scanner;

/**
 *
 * @author Alexis García Aguado
 * @author Javier Cuadrado García
 */
public class CalculadoraEntornos {

    public static void main(String[] args) {
        //Programa de una calcualdora. Colaborativo entre Alexis y Javier.
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        sc.close();
        
        
    }
    
}

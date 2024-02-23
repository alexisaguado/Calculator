
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
    
    /*
    * Muestra un menú simple de opciones para una calculadora en Java.
    * Imprime en la consola las opciones disponibles, solicitando al usuario que seleccione una opción.
    * 
    * Este método no acepta parámetros y no devuelve ningún valor.
    */
     private static void mostrarMenu() {
        System.out.println("Bienvenidos a nuestra calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción (1-5): ");
    }

    /*
    * Realiza la suma de dos números ingresados por el usuario.
    * Utiliza un objeto Scanner para obtener la entrada del usuario desde la consola.
    * Imprime el resultado de la suma en la consola.
    * 
    * Este método no acepta parámetros y no devuelve ningún valor.
    */
    private static void sumar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    /*
    * Realiza la resta de dos números ingresados por el usuario.
    * Utiliza un objeto Scanner para obtener la entrada del usuario desde la consola.
    * Imprime el resultado de la resta en la consola.
    * 
    * Este método no acepta parámetros y no devuelve ningún valor.
    * 
    */
    private static void restar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    /*
    * Realiza la multiplicación de dos números ingresados por el usuario.
    * Utiliza un objeto Scanner para obtener la entrada del usuario desde la consola.
    * Imprime el resultado de la multiplicación en la consola.
    *  
    * Este método no acepta parámetros y no devuelve ningún valor.
    */
    private static void multiplicar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 * num2;
        System.out.println("Resultado de la multiplicación: " + resultado);
    }

   /*
    * Realiza la división de dos números ingresados por el usuario.
    * Utiliza un objeto Scanner para obtener la entrada del usuario desde la consola.
    * Imprime el resultado de la división en la consola.
    * Si el denominador es cero, imprime un mensaje de error.
    * 
    * Este método no acepta parámetros y no devuelve ningún valor.
    * 
    */
    private static void dividir() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numerador: ");
        double numerador = scanner.nextDouble();

        System.out.print("Ingrese el denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}

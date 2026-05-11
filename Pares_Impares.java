import java.util.Scanner; // para leer el teclado

public class Pares_Impares {
    public static void main(String[] args) {
        //  variables 
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10]; //  arreglo para guardar 10 datos
        int pares = 0;   // Contador para los pares
        int impares = 0; // Contador para los impares

        // para pedir los datos al usuario
        System.out.println("Ingresa 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = leer.nextInt(); // Guardamos el número en la posición 'i'
            
            //  si el número guardado es par o impar
            // El símbolo % nos da el residuo. Si el residuo de entre 2 es 0, es par.
            if (numeros[i] % 2 == 0) {
                pares++; // Si entra aquí, sumamos uno a los pares
            } else {
                impares++; // Si no, sumamos uno a los impares
            }
        }

        //  resultados finales en la consola
        System.out.println("\n--- Conteo Final ---");
        System.out.println("Números pares encontrados: " + pares);
        System.out.println("Números impares encontrados: " + impares);
    }
}
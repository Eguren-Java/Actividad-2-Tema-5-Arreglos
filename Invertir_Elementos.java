import java.util.Scanner;

public class Invertir_Elementos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[6]; // Arreglo para los 6 numeros que pide la tarea

        // Llenar el arreglo con los datos del teclado
        System.out.println("Escribe los 6 numeros para el arreglo:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Dato en posicion " + i + ": ");
            datos[i] = entrada.nextInt();
        }

        // Mostrar el arreglo al reves
        System.out.println("\n--- Arreglo invertido ---");
        
       
        // Empezamos en 5 (porque el arreglo llega hasta el indice 5)
        // Y bajamos de uno en uno con i-- hasta llegar al 0
        for (int i = 5; i >= 0; i--) {
            System.out.print(datos[i] + " ");
        }
        
        System.out.println(); // Solo un espacio para que no se pegue el texto final
    }
}
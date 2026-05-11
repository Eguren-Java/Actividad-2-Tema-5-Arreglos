import java.util.Scanner;

public class Mayor_Menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[8]; // creamos el espacio para los 8 datos

        //  Pedir los numeros y guardarlos
        System.out.println("Ingresa los 8 numeros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Numero: ");
            lista[i] = sc.nextInt();
        }

        
        // Decimos que el primero es el mas grande y el mas chico para empezar
        int grande = lista[0];
        int chico = lista[0];

        // Revisar el resto de la lista
        for (int i = 1; i < 8; i++) {
            // Si el que sigue es mas grande, actualizamos la variable
            if (lista[i] > grande) {
                grande = lista[i];
            }
            // Si el que sigue es mas chico, actualizamos la otra
            if (lista[i] < chico) {
                chico = lista[i];
            }
        }

        //  Mostrar los resultados
        System.out.println("El numero mayor es: " + grande);
        System.out.println("El numero menor es: " + chico);
    }
}
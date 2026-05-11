import java.util.Scanner; //  para leer datos

public class Suma {
    public static void main(String[] args) {
        //  Preparar las herramientas
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[5]; // Arreglo para guardar los 5 números
        int sumaTotal = 0; // Variable para ir acumulando la suma

        System.out.println("Ingresa 5 números enteros para sumarlos:");

        //  Ciclo para pedir los datos y sumarlos al mismo tiempo
        for (int i = 0; i < 5; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            numeros[i] = leer.nextInt(); // Guardamos el número en la posición actual
            
            //  sumamos el valor nuevo a lo que ya teníamos
            // sumaTotal += numeros[i] es lo mismo que: sumaTotal = sumaTotal + numeros[i]
            sumaTotal = sumaTotal + numeros[i];
        }

        // resultado final
        System.out.println("\n------------------------------");
        System.out.println("La suma total de los elementos es: " + sumaTotal);
        System.out.println("------------------------------");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero, contador = 0, numParMayor = 0, contNumImpar = 0, totalImpar = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un número (Si es negativo el programa se cerrará): ");
        numero = teclado.nextInt();

        while (numero > -1) {
            contador++;

            if (numero % 2 == 0) {
                numParMayor = numero > numParMayor ? numero : numParMayor;
            } else {
                totalImpar += numero;
                contNumImpar++;
            }
            System.out.print("Dime un número (Si es negativo el programa se cerrará): ");
            numero = teclado.nextInt();
        }

        System.out.println("Se han introducido " + contador + " números.");
        System.out.println("La media de los números impares es " + totalImpar / contNumImpar);
        System.out.println("El número mayor de los pares introducidos es " + numParMayor);

    }
}

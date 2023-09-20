import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1, nota2, media;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la nota del primer examen: ");
        nota1 = teclado.nextDouble();
        System.out.print("Dime la nota del segundo examen: ");
        nota2 = teclado.nextDouble();

        System.out.println("\nNota del primer control: " + nota1);
        System.out.println("Nota del segundo control: " + nota2);

        media = (nota1 + nota2) / 2;

        if (media < 5.0) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto / no apto): ");
            if (teclado.next().equalsIgnoreCase("apto")) {
                System.out.println("Tu nota de Programación es 5.");
            }
        } else {
            System.out.println("Tu nota de Programación es " + media);
        }
    }
}

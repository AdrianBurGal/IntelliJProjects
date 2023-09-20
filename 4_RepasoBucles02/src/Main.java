import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String numero, digito, resultado = "El dígito se encuentra en las posiciones ";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un número: ");
        numero = teclado.next();

        System.out.println("Dime un dígito: ");
        digito = teclado.next();

        String[] digitos = numero.split("");

        for (int indice = 0; indice < digitos.length; indice++) {
            if(digitos[indice].equals(digito)) {
                resultado += indice + " ";
            }
        }
        System.out.println(resultado);
    }
}

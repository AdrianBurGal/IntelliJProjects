import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double base, total = 0, precioConIva = 0, codigoPromocional = 0, iva = 0;
        int numIva = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        base = teclado.nextInt();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");

        switch (teclado.next().toLowerCase()) {
            case "general" -> numIva = 21;
            case "reducido" -> numIva = 10;
            case "superreducido" -> numIva = 4;
            default -> System.out.println("IVA no encontrado.");
        }
        iva = base / numIva;
        precioConIva = base + iva;

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");

        switch (teclado.next().toLowerCase()) {
            case "nopro" -> codigoPromocional = precioConIva;
            case "mitad" -> codigoPromocional = precioConIva / 2;
            case "meno5" -> codigoPromocional = precioConIva - 5;
            case "5porc" -> codigoPromocional = precioConIva * 0.95;
            default -> System.out.println("Código promocional no encontrado.");
        }

        System.out.println("Base imponible: " + base);
        System.out.println("IVA(" + numIva + "%): " + iva);
        System.out.println("Precio con IVA: " + precioConIva);
        System.out.println("Cód.promo.(): " + codigoPromocional);
        System.out.println("TOTAL: " + codigoPromocional);
    }
}
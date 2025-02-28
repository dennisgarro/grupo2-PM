import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Boleto {
    int numeroDeSerie;
    int fila;
    String nombreComprador;
    double precio;

    public Boleto(int numeroDeSerie, int fila, String nombreComprador, double precio) {
        this.numeroDeSerie = numeroDeSerie;
        this.fila = fila;
        this.nombreComprador = nombreComprador;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "numeroDeSerie=" + numeroDeSerie +
                ", fila=" + fila +
                ", nombreComprador='" + nombreComprador + '\'' +
                ", precio=" + precio +
                '}';
    }
}

public class Main {
    public void P4(int d) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Boleto> boletos = new ArrayList<>();

            for (int i = 0; i < d; i++) {
                System.out.print("Ingrese el número de serie: ");
                int numeroDeSerie = scanner.nextInt();

                System.out.print("Ingrese la fila: ");
                int fila = scanner.nextInt();

                scanner.nextLine(); // Consumir la nueva línea

                System.out.print("Ingrese el nombre del comprador: ");
                String nombreComprador = scanner.nextLine();

                System.out.print("Ingrese el precio: ");
                double precio = scanner.nextDouble();

                boletos.add(new Boleto(numeroDeSerie, fila, nombreComprador, precio));
            }

            // Ordenar boletos por fila de mayor a menor
            Collections.sort(boletos, new Comparator<Boleto>() {
                @Override
                public int compare(Boleto b1, Boleto b2) {
                    return Integer.compare(b2.fila, b1.fila);
                }
            });

            // Imprimir los boletos ordenados
            for (Boleto boleto : boletos) {
                System.out.println(boleto);
            }
        }
    }
}

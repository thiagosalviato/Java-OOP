import java.util.Scanner;
import java.util.Locale;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos você consumiu de telefonia?");
        int minutos = sc.nextInt();
        double extra = (minutos - 100) * 2.00;
        double valorEspecial = 50.00 + extra;
        double valorPadrao = 50.00;

        if (minutos > 100) {
            System.out.println("Valor a pagar: R$ " + valorEspecial);
        } else {
            System.out.println("Valor a pagar: R$ " + valorPadrao);
        }
    }
}

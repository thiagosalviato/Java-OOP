import java.util.Locale;

public class area {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio = 2.00;

        double area = 3.14159 * (raio*raio);

        System.out.println("A: " + area);

        System.out.println("-----------------------------");

        double raio2 = 100.64;

        double area2 = 3.14159 * (raio2*raio2);

        System.out.println("A: " + area2);

        System.out.println("-----------------------------");

        double raio3 = 150.00;

        double area3 = 3.14159 * (raio3*raio3);

        System.out.println("A: " + area3);

        System.out.println("-----------------------------");

    }
}

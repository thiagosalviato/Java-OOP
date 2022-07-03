import java.util.Locale;

public class FString {
    public static void main(String[] args) {
        double y = 32.4324242;

        System.out.printf("%.4f%n",y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n",y);

        System.out.println("Tempo: " + y);


        String nome = "Thiago";
        int idade = 22;
        double renda = 3490.80;
        System.out.printf("%s tem %d anos e R$%.2f reais%n.", nome, idade, renda);

    }
}
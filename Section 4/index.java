import java.util.Locale;

public class index {
    public static void main(String[] args) {
        
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.println(product1 + ", which price is $ " + price1);
        System.out.println(product2 +  ",which price is $ " + price2);
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.println("Measue with eight decimal places: " + measure);
        Locale.setDefault(Locale.US);
        System.out.println("US decimal point: " + measure);

    }
}

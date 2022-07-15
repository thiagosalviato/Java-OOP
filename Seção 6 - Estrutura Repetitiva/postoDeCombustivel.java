import java.util.Scanner;

public class postoDeCombustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool,gasolina,diesel;
        System.out.println("Insira um Combustivel: (1 para alcool, 2 para gasolina e 3 para diesel)");
        int tipoCombustivel = sc.nextInt();
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        while(tipoCombustivel != 4){
            if(tipoCombustivel == 1){
                alcool += 1;
            } else if(tipoCombustivel == 2){
                gasolina += 1;
            } else if(tipoCombustivel == 3){
                diesel += 1;
            } else if(tipoCombustivel > 4 || tipoCombustivel < 1){
                System.out.println("Digite novamente um valor válido: ");
            }
            tipoCombustivel = sc.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}

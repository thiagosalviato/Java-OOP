import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x,y;
        System.out.println("Iremos terminar qual quadrante se encaixa suas coordenadas!");
        System.out.println("Insira a coordenada de x:");
        x = sc.nextInt();
        System.out.println("Insira a coordenada de y:");
        y = sc.nextInt();

        while(x != 0 || y != 0 ){
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0){
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0){
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();

    }
}

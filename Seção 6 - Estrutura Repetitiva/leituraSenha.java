import java.util.Scanner;

public class leituraSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha, x;
        senha = 2002;
        System.out.println("Digite a senha: ");
        x = sc.nextInt();

        while(x != senha){
            System.out.println("Senha Inválida");
            System.out.println("Tente novamente: ");
            x = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();

    }
}

import java.util.Scanner;
public class Atividade04Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = "adimin";
        String password = "1234";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc1.nextLine();
        System.out.println("Digite sua Senha: ");
        String senha = sc1.nextLine();

        if (usuario.equals(nome) && password.equals(senha)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. ");
        }
        sc.close();
    }



}


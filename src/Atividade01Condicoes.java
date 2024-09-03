import java.util.Scanner;

public class Atividade01Condicoes{
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira sua idade
        System.out.print("Por favor, insira sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Fecha o scanner
        scanner.close();
    }
}

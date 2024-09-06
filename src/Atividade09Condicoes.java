import java.util.Scanner;
public class Atividade09Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");

        double num = sc.nextDouble();

        if (num >= 1) {
            System.out.println("O número " + num + " é Positivo");
        } else if (num == 0) {
            System.out.println("O número " + num + " não é positivo nem negativo ");
        } else if (num < 0) {
            System.out.println("O número " + num + " é Negativo");
        }
        sc.close();
    }
}

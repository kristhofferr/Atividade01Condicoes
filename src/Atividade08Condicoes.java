import java.util.Scanner;
public class Atividade08Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");

        double celsius = sc.nextDouble();

        if (celsius > 30) {
            System.out.println("Quente!");

        } else if (celsius > 15 && celsius <= 30) {
            System.out.println("Agradável!");

        } else if (celsius < 15) {
            System.out.println("Frio!");
        }
        sc.close();
    }
}

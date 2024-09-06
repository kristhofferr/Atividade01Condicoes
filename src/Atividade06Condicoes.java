import java.util.Scanner;
public class Atividade06Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota :");

        double nota = sc.nextDouble();


        if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado!");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
        sc.close();
    }
}
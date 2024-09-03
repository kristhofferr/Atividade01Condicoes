import java.util.Scanner;
public class Atividade03Condicoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resposta;

        System.out.println("Digite um número:");

        do {

             int num = scanner.nextInt();

             if (num % 2 == 0) {
             System.out.println("O número " + num + " é par");
            } else {
            System.out.println("O número " + num + " é ínpar");
            }
            System.out.println("Deseja continuar ? sim/não:");
             resposta = scanner.next().toLowerCase();
               if (resposta.equals("sim")) {

               System.out.println("Digite outro número");
               }
          }while
                (resposta.equals("sim")) ;  {

        }

          System.out.println("Programa encerrado");


       scanner.close();
    }
}

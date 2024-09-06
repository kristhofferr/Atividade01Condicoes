import java.util.Scanner;
public class Atividade05Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 :");

        int dia = sc.nextInt();

        switch (dia) {
            case 1:

                System.out.println("Segunda-feira");
                break;
                case 2:

                    System.out.println("Terca-feira");
                    break;
                    case 3:

                        System.out.println("Quarta-feira");
                        break;
                        case 4:

                            System.out.println("Quinta-feira");
                            break;
                            case 5:

                                System.out.println("Sexta-feira");
                                break;
                                case 6:
                                    System.out.println("Sábado");
                                    break;
                                    case 7:

                                        System.out.println("Domingo");
                                        break;
                                        default:

                                            System.out.println("Número inválido.Porfavor insira" +
                                                    " um número de 1 a 7.");
                                            break;
        }
         sc.close();

    }
}

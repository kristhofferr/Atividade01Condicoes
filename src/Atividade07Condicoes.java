import java.util.Scanner;
public class Atividade07Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma operação  ");
        System.out.println("1- Adição ");
        System.out.println("2-Subtração ");
        System.out.println("3-Multiplicação ");
        System.out.println("4-DIvisão ");

        int op = sc.nextInt();

        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        double resultado = 0;
        switch (op) {
            case 1:
                resultado = num1 + num2;

                System.out.println("Resultado " + resultado);
                break;
                case 2:
                    resultado = num1 - num2;

                    System.out.println("Resulatado " + resultado);
                    break;
                    case 3:
                        resultado = num1 * num2;

                        System.out.println("Resultado " + resultado);
                        break;
                        case 4:
                                resultado = num1 / num2;

                                System.out.println("Resultado " + resultado);

                            }
                            sc.close();
                   }
           }


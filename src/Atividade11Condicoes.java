import java.util.Scanner;
public class Atividade11Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário bruto:");
        double sal = sc.nextDouble();

        System.out.println("Quantos anos foram trabalhados:");
        int anos = sc.nextInt();

        double bonus = 0;

        double imposto = 0;


        if (anos > 10) {
            bonus = sal * 0.10;
        } else if (anos >=5 &&  anos <= 10){
            bonus = sal * 0.05;
        }else{
            bonus = 0;
        }
        if (sal > 5000) {
            imposto = sal * 0.27;

        } else if (sal > 3000 && sal <= 4999.99) {
            imposto = sal * 0.18;

        } else {
            imposto = sal * 0.10;
        }
        double valorLiquido = sal  + bonus - imposto;
        System.out.println("O valor bruto é de " + sal);
        System.out.println("O bonus recebido foi de  " + bonus);
        System.out.println("O imposto descontado foi de  " + imposto);
        System.out.println("O valor liquido foi de  " + valorLiquido);

        sc.close();
    }

}

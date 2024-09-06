import java.util.Scanner;
public class Atividade10Condicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total da compra:");
        double valor = sc.nextDouble();

        double desconto = 0;

        if (valor > 500){
            desconto = valor * 0.20;

        }else if (valor >=200 && valor <= 500 ){
            desconto = valor * 0.10;

        }else if (valor >=100 && valor <=199.99){
            desconto = valor * 0.05;

        }else {
            desconto = 0;

        }
            double valorFinal = valor - desconto;

            System.out.println("Valor do desconto é R$ " +  desconto);
            System.out.println("Valor final após o desconto é de R$" + valorFinal);



         sc.close();

    }
}

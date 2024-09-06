import java.util.Scanner;
public class Atividade02Condicoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite sua nota:");

        double nota = sc.nextDouble();
        
        if (nota >=9 && nota<=10) {
            System.out.println("Excelente");
        }else if (nota >=7 && nota<9) {
            System.out.println("Bom");
        }else if (nota >=5 && nota< 7){
            System.out.println("Satisfatório");
        }else if (nota <5){
            System.out.println("Insatisfatório");
        }else {
            System.out.println("Nota inválida . Por favor digite uma nota entre 0 e 10");
        }
        sc.close();
    }
}

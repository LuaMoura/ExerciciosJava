package exerciciosjava;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor do dep�sito mensal: ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosMensal = scanner.nextDouble();

        taxaJurosMensal = taxaJurosMensal / 100;

        double montante = 0;

        for (int i = 0; i < 12; i++) {
            montante += montante * taxaJurosMensal;
            montante += depositoMensal;
        }

        System.out.printf("O montante ap�s 12 meses �: R$ %.2f%n", montante);

        scanner.close();

	}

}

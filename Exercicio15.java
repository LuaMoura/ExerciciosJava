package exerciciosjava;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sal�rio atual do funcion�rio: ");
        double salarioAtual = scanner.nextDouble();

        double aumento = salarioAtual * 0.15;

        double novoSalario = salarioAtual + aumento;

        System.out.printf("O novo sal�rio com aumento de 15%% �: R$ %.2f%n", novoSalario);

        scanner.close();

	}

}

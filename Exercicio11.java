package exerciciosjava;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro n�mero: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A m�dia aritm�tica �: %.2f%n", media);

        scanner.close();

	}

}

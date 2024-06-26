package exerciciosjava;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("Primeiro n�mero: " + primeiroNumero);
        System.out.println("Segundo n�mero: " + segundoNumero);

        int temp = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = temp;

        System.out.println("Depois da troca:");
        System.out.println("Primeiro n�mero: " + primeiroNumero);
        System.out.println("Segundo n�mero: " + segundoNumero);

        scanner.close();

	}

}

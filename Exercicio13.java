package exerciciosjava;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero % segundoNumero == 0) {
            System.out.println(primeiroNumero + " � m�ltiplo de " + segundoNumero);
        } else {
            System.out.println(primeiroNumero + " n�o � m�ltiplo de " + segundoNumero);
        }

        scanner.close();

	}

}

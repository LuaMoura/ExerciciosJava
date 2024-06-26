package exerciciosjava;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Digite um n�mero: ");
	        double numero = scanner.nextDouble();

	        if (numero > 0) {
	            System.out.println("O n�mero " + numero + " � positivo.");
	        } else if (numero < 0) {
	            System.out.println("O n�mero " + numero + " � negativo.");
	        } else {
	            System.out.println("O n�mero � zero.");
	        }

	        scanner.close();

	}

}

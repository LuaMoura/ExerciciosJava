package exerciciosjava;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("A pessoa � uma crian�a.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("A pessoa � um adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("A pessoa � um adulto.");
        } else {
            System.out.println("A pessoa � um idoso.");
        }

        scanner.close();

	}

}

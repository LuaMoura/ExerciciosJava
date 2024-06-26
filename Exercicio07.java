package exerciciosjava;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o sal�rio base do funcion�rio: ");
        double salarioBase = scanner.nextDouble();
        double comissao = salarioBase * 0.05;
        double salarioLiquido = salarioBase + comissao;
        
        
        System.out.printf("O sal�rio l�quido do funcion�rio �: R$ %.2f%n", salarioLiquido);
        scanner.close();

	}

}

package exerciciosjava;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Qual a base do seu triangulo?");
		double base = valor.nextDouble();
		
		System.out.println("Qual a altura do seu tri�ngulo?");
		double altura = valor.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A �rea do seu tri�ngulo �: " + area);
		

	}

}

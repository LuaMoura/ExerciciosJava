package exerciciosjava;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = valor.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("A �rea do circulo �: " + area);
		System.out.println("O per�metro do circulo �: " + perimetro);
		
		
	}

}

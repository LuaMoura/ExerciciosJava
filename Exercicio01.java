package exerciciosjava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado
		
		// defini��o de vari�vel do tipo inteiro
		// defini��o de vari�vel do tipo string
		
		
		
		
		System.out.println("Entre com o primeiro numero: ");
		int numero1 = valor.nextInt();// usamos nextInt() para atributos do tipo int
		
		System.out.println("Entre com o segundo numero: ");		
		int numero2 = valor.nextInt();// usamos nextInt() para atributos do tipo int
		
		int soma = numero1 + numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		int subtracao = numero1 - numero2;
		System.out.println("a soma dos numeros �: " + soma);
		System.out.println("a multiplica��o dos numeros �: " + multiplicacao);
		System.out.println("a divis�o dos numeros �: " + divisao);
		System.out.println("a subtra��o dos numeros �: " + subtracao);

	}

}

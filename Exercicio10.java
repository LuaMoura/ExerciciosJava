package exerciciosjava;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 Scanner valor = new Scanner(System.in);

	        System.out.print("Digite um n�mero inteiro: ");
	        int numero = valor.nextInt();
	        
	        System.out.println("Tabuada de multiplica��o de " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	        
	        valor.close();

	}

}

package javaexercicios;

public class exer68 {

	public static void main(String[] args) {
		// 68) Crie um programa que exiba os n�meros pares de 1 a 50.

		 System.out.println("N�meros pares de 1 a 50:");
		 
		for (int n = 1; n <= 50; n++) {
           
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
	}

}

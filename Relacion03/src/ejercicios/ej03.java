package ejercicios;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = teclado.nextInt();
		int i = 0;
		
		
		
		do {
			System.out.println(num1 + " x " + i + " = " + (num1*i));
			i++;
			
		} while (i!=11);
		
		teclado.close();
	}

}

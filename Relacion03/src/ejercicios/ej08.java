package ejercicios;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = teclado.nextInt();;
		do {
			System.out.println("has fallado, introduce un numero nuevo");
			num1 = teclado.nextInt();
			
		} while (num1!= 8);
		
		System.out.println("has acertado el numero");
		
		teclado.close();
	}

}

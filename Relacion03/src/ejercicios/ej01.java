package ejercicios;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = teclado.nextInt();
		
		
		for (int i = 0; i < 11; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1*i));
		}
		
		teclado.close();
	}

}

package ejercicios;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = teclado.nextInt();
		int resu =1;

		for (int i = 1; i < num1+1; i++) {
			resu = resu*i;
			System.out.println(i);
		}
		System.out.println(resu);
		
		
		teclado.close();
	}

}

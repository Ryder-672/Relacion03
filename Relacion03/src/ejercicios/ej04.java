package ejercicios;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero de inicio: ");
		int num1 = teclado.nextInt();
		System.out.println("introduce un numero de final: ");
		int num2 = teclado.nextInt();

		
		for ( int i = num1; i < num2; i++) {
			if ((i%2)==0) {
				i++;
			}
			
			System.out.println(i);
	
		}
		
		
		
		teclado.close();
		
		
	}

}

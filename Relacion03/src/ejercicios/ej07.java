package ejercicios;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un numero de inicio: ");
		int num1 = teclado.nextInt();
		System.out.println("introduce un numero de final: ");
		int num2 = teclado.nextInt();
		int contador = 0;

		
		for ( int i = num1; i < num2; i++) {
			if ((i%7)==0) {
				
				System.out.println(i);
				++contador;
				
			}
	
		}
		System.out.println("hay un total de " + contador + " numeros multiplos de 7 entre " + num1 +" y "+ num2);
		
		
		teclado.close();
	}

}

package ejercicios;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce el alto");
		int alto = teclado.nextInt();
		System.out.println("introduce el ancho");
		int ancho = teclado.nextInt();
		
		for (int i = 0 ; i < alto+1; i++) {
			System.out.println();
			for (int j = 0; j < ancho+1; j++) {
				if (i==0 || i == alto) {
					System.out.print("*");
					
				}else if (j==0 || j == ancho) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
			}
		}
		
		teclado.close();
	}

}

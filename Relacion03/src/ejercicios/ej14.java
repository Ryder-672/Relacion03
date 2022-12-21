package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce el numero: ");
		int num = teclado.nextInt();
		boolean primo = true;
		int cuenta = 0; 
		for (int i = 2; i < num; i++) {
			cuenta = num%i;
			if (cuenta == 0) {
				primo = false;
			}
			
		}
		if (primo == true) {
			System.out.println(" el numero es primo");
		}else {
			System.err.println("el numero no es es primo");
		}
		
		teclado.close();
	}

}

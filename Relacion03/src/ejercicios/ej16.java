package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce el numero: ");
		int num1 = teclado.nextInt();
		System.out.println("introduce otro numero");
		int num2 = teclado.nextInt();
	
		int resu = num1/num2;

		for (int i = 0; i <= resu; i++) {
			num1 = num1-num2;
			System.out.println(num1 +"   " + i);
		}


		
		teclado.close();
	}

}

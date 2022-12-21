package ejercicios;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado= new Scanner(System.in);
		int pares = 0;
		int inpar = 0;
		int ceros = 0;
		int num = 0;
		for (int i = 0; i < 11; i++) {
			System.out.println("introduce un numero:");
			num = teclado.nextInt();

			if (num%2==0 && num!=0) {
				pares++;
				System.out.println("el numero introducido es: " + num+" y es par");
			}else if (num%2!=0) {
				inpar++;
				System.out.println("el numero introducido es: " + num + " y es impar");
			}else if (num==0) {
				ceros++;
				System.out.println("el numero introducido es: " + num + " y es un cero ");
			}
			
		}
		
		System.out.println("hay "+ pares + " numeros pares ");
		System.out.println("hay "+ inpar + " numeros inpares ");
		System.out.println("hay "+ ceros + " numeros cero");
		teclado.close();
	}

}

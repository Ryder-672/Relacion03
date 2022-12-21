package ejercicios;

public class ej12 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int i = 0;
		
		do {
			System.out.println("la tabla de multiplicar de " + i);
			int j = 0;

			do {
				System.out.println(i+" x " + j + " = " + (j*i));
				j++;

			} while (j!=11);
			i++;
			
		} while (i!=11);

	}

}

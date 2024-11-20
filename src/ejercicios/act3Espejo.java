package ejercicios;

import java.util.Random;

public class act3Espejo {

	public static void main(String[] args) {
	 mostrarNumerosAleatorios();
}

	public static void mostrarNumerosAleatorios() {
		   Random random = new Random();
		   for (int i = 0; i < 20; i++) {
		   int numero = random.nextInt(10) + 1;
		            System.out.println(numero);
		        }
		    
		

	}

}

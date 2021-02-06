package operaciones;

import java.util.Scanner;

public class Operacion {

	protected Scanner leer;
	protected int valor1;
	protected int valor2;
	protected int resultado;

	public Operacion() {
		leer = new Scanner(System.in);
	}
	
	public void cargar1() {
		System.out.print("Ingrese el primer valor:");
		valor1 = leer.nextInt();
	}

	public void cargar2() {
		System.out.print("Ingrese el segundo valor:");
		valor2 = leer.nextInt();
	}

	public void mostrarResultado() {
		System.out.println(resultado);
	}

}

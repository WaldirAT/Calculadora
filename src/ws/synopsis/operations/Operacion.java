package ws.synopsis.operations;

import java.util.Scanner;

public class Operacion {

	public Scanner leer;
	public double num1;
	public double num2;
	public double resultado;

	public Operacion() {
		leer = new Scanner(System.in);
	}

	public void cargar1() {
		System.out.print("Ingrese el primer valor:");
		num1 = leer.nextInt();
	}

	public void cargar2() {
		System.out.print("Ingrese el segundo valor:");
		num2 = leer.nextInt();
	}

	public void mostrarResultado() {
		System.out.println(Math.round(resultado*100)/100.0);
	}

}

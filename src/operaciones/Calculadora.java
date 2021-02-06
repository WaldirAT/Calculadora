package operaciones;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Elegir la operacion a calcular");
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		
		int opc = leer.nextInt();

		if (opc == 1) {
			Suma suma = new Suma();
			suma.cargar1();
			suma.cargar2();
			suma.operar();
			System.out.print("El resultado de la suma es:");
			System.out.println("\n");
			suma.mostrarResultado();

		}
		if (opc == 2) {

			Resta resta = new Resta();
			resta.cargar1();
			resta.cargar2();
			resta.operar();
			System.out.print("El resultado de la resta es:");
			resta.mostrarResultado();
		}
		if (opc == 3) {
			Multiplicacion multi1 = new Multiplicacion();
			multi1.cargar1();
			multi1.cargar2();
			multi1.operar();
			System.out.println("El resultado de la multiplicacion es:");
			multi1.mostrarResultado();
		}
		if (opc == 4) {
			Division div = new Division();
			div.cargar1();
			div.cargar2();
			div.operar();
			System.out.println("El resultado de la division es:");
			div.mostrarResultado();
		}

	}

}

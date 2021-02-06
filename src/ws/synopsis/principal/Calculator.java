package ws.synopsis.principal;

import java.util.Scanner;
import ws.synopsis.operations.*;

public class Calculator {

	public static void main(String[] args) {

		Scanner leer2 = new Scanner(System.in);

		System.out.println("Elegir la operacion a calcular");
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		
		int opc = leer2.nextInt();

		if (opc == 1) {
			Add add = new Add();
			add.cargar1();
			add.cargar2();
			add.operar();
			System.out.print("El resultado de la suma es:");
			add.mostrarResultado();

		}
		else if (opc == 2) {

			Subtract subtract = new Subtract();
			subtract.cargar1();
			subtract.cargar2();
			subtract.operar();
			System.out.print("El resultado de la resta es:");
			subtract.mostrarResultado();
		}
		else if (opc == 3) {
			Multiplicacion multi1 = new Multiplicacion();
			multi1.cargar1();
			multi1.cargar2();
			multi1.operar();
			System.out.println("El resultado de la multiplicacion es:");
			multi1.mostrarResultado();
		}
		else if (opc == 4) {
			Division div = new Division();
			div.cargar1();
			div.cargar2();
			div.operar();
			System.out.println("El resultado de la division es:");
			div.mostrarResultado();
		}
		else {
			System.out.println("Opcion invalida");
		}

	}

}

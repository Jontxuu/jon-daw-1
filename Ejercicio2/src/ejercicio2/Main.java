package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Introduzca el tipo de cliente -->");
		String tipoUsuario = scanner.next();
		
		System.out.println("Introduzca el importe de la compra");
		double importeCompra = scanner.nextDouble();
		
		switch ( tipoUsuario) {
		case "Normal":
		System.out.println(importeCompra);
		break;
		
		
		case "Vip":
			importeCompra = importeCompra*80/100;
			System.out.println(importeCompra);
		break;
		
	
		case "Socio":
			importeCompra =  importeCompra*95/100;
			System.out.println(importeCompra);
		break;
	    }
		
		
		
		
		
		
		
		scanner.close();
	}

}

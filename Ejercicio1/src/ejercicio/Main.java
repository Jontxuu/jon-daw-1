package ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese su nombre porfavor -->");
	String nombre = scanner.nextLine();
    
	System.out.println("Ingrese su nota de ingles");
	double notaIngles = scanner.nextDouble();
	
	System.out.println("Ingrese su nota de matematicas");
	double notaMatematicas = scanner.nextDouble();
	
	System.out.println("Ingrese su nota de euskera");
	double notaEuskera = scanner.nextDouble();
	
	System.out.println("Ingrese su nota de lengua");
	double notaLengua = scanner.nextDouble();
	
	System.out.println("Ingrese su nota de filosofia");
	double notaFilosofia = scanner.nextDouble();
	
	double media = (notaEuskera+notaFilosofia+notaIngles+notaLengua+notaMatematicas) / 5;
	System.out.println("La nota media del alumno es: " + media);
	
	if (media >= 5 ) {
		System.out.println("El alumno " + nombre + " esta aprobado");
	} else {
		System.out.println("El alumno " + nombre + "esta suspendido");
	}
	
	scanner.close();
	}

}
